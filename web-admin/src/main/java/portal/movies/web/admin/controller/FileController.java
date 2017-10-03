package portal.movies.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.File;
import portal.movies.common.dao.FilesDAO;
import portal.movies.common.entity.FilesEntity;
import portal.movies.common.servies.IBiz;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(path = "files")
public class FileController {

    @Value("${upload.dir}")
    String uploadDir;

    @Resource(name = "filesDAO")
    FilesDAO filesDAO;

    @Autowired
    IBiz biz;

    @GetMapping()
    String getUploadUI(Model model) {
        FilesEntity fileEntity = new FilesEntity();
        model.addAttribute("file", fileEntity);
        model.addAttribute("fileTypes", portal.movies.common.File.TYPES);
        return "upload_ui";
    }

    @GetMapping(value = "page-{num}")
    String getFiles(Model model, @PathVariable("num") long num) {
        List<FilesEntity> files = biz.findAllFiles();
        model.addAttribute("files", files);
        return "list_file";
    }

    @PostMapping
    String processUpload(@ModelAttribute("file") FilesEntity fileEntity,
                         @RequestParam(name = "tags") String tags,
                         @RequestParam(name = "uploadFile") MultipartFile file,
                         @RequestParam(value = "fileType", required = true) Integer type) {

        String fileName = biz.httpUpload(file);
        String filePath = String.format("%s/%s", uploadDir, fileName);
        java.io.File upload = new java.io.File(filePath);

        String hostInfo = null;

        switch (type) {
            case File.ATTACH:
                hostInfo = biz.upload2AttatchRepo(upload);
                break;
            case File.PHOTO:
                hostInfo = biz.upload2PhotoRepo(upload);
                break;
            case File.VIDEO:
                hostInfo = biz.upload2VideoRepo(upload);
                break;
            case File.SUBTITLE:
                hostInfo = biz.upload2SubtitleRepo(upload);
                break;
            default:
                break;
        }
        if (hostInfo != null) {
            fileEntity.setHostAddr(hostInfo);
            fileEntity.setFileName(fileName);
            fileEntity.setFileStatus(1);
            biz.saveFile(fileEntity);
        }
        return "upload_success";
    }
}