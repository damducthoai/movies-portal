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

@Controller
@RequestMapping(path = "files")
public class FileController {

    @Value("${upload.dir}")
    String uploadDir;

    @Resource(name = "filesDAO")
    FilesDAO filesDAO;

    @Autowired
    IBiz biz;

    @GetMapping
    String getUploadUI(Model model) {
        FilesEntity fileEntity = new FilesEntity();
        //fileEntity.setThumnailId((long) 1);
        model.addAttribute("file", fileEntity);
        model.addAttribute("fileTypes", portal.movies.common.File.TYPES);
        return "upload_ui";
    }

    @PostMapping
    String processUpload(@ModelAttribute("file") FilesEntity fileEntity,
                         @RequestParam(name = "tags") String tags,
                         @RequestParam(name = "uploadFile") MultipartFile file,
                         @RequestParam(value = "fileType", required = true) Integer type) {

        String fileName = biz.httpUpload(file);
        String filePath = String.format("%s/%s", uploadDir, fileName);
        java.io.File upload = new java.io.File(filePath);

        switch (type) {
            case File.ATTACH:
                biz.upload2AttatchRepo(upload);
                break;
            case File.PHOTO:
                biz.upload2PhotoRepo(upload);
                break;
            case File.VIDEO:
                biz.upload2VideoRepo(upload);
                break;
            case File.SUBTITLE:
                biz.upload2SubtitleRepo(upload);
                break;
            default:
                break;
        }
        return "upload_success";
    }
}
