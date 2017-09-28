package portal.movies.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.servies.IBiz;
import portal.movies.repository.entity.FileEntity;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping(path = "files")
public class FileController {

    @Value("${upload.dir}")
    String uploadDir;

    @Autowired
    IBiz biz;

   /* @Autowired
    FTPClient ftp;*/

    @GetMapping
    String getUploadUI(Model model) {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setThumnailId((long) 1);
        model.addAttribute("file", fileEntity);
        model.addAttribute("fileTypes", portal.movies.common.File.TYPES);
        return "upload_ui";
    }

    @PostMapping
    String processUpload(@ModelAttribute("file") FileEntity fileEntity,
                         @RequestParam(name = "tags") String tags,
                         @RequestParam(name = "uploadFile") MultipartFile file) {
        try {
            byte[] data = file.getBytes();

            File serverFile = new File(String.format("%s/%s", uploadDir, file.getOriginalFilename()));

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(serverFile));

            outputStream.write(data);

            biz.upload2AttatchRepo(serverFile);

            /*ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));

            int reply;
            ftp.connect("localhost");
            reply = ftp.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                //throw new Exception("Exception in connecting to FTP Server");
            }

            ftp.login("admin", "admin");
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();

            FileInputStream inputStream = new FileInputStream(serverFile);

            this.ftp.storeFile("/abc/" + "test", inputStream);

            if (this.ftp.isConnected())
                try {
                    ftp.logout();
                    ftp.disconnect();
                } catch (IOException f) {
                    f.printStackTrace();
                    // do nothing as file is already saved to server
                }*/

            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "upload_success";
    }
}
