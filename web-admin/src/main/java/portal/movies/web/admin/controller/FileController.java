package portal.movies.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.File;
import portal.movies.repository.entity.FileEntity;

@Controller
@RequestMapping(path = "files")
public class FileController {
    @GetMapping
    String getUploadUI(Model model) {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setThumnailId((long) 1);
        model.addAttribute("file", fileEntity);
        model.addAttribute("fileTypes", File.TYPES);
        return "upload_ui";
    }

    @PostMapping
    String processUpload(@ModelAttribute("file") FileEntity fileEntity,
                         @RequestParam(name = "tags") String tags,
                         @RequestParam(name = "uploadFile") MultipartFile uploadFile) {
        return "upload_success";
    }
}
