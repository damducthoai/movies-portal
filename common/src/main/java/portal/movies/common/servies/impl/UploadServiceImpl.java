package portal.movies.common.servies.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.servies.UploadService;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class UploadServiceImpl implements UploadService {

    final String baseString = String.valueOf(new Date());
    final AtomicLong atomicLong = new AtomicLong();
    String uploadDir;


    public UploadServiceImpl() {
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

    @Override
    public String httpUpload(MultipartFile multipartFile) {
        boolean success = false;
        String originalFileName = multipartFile.getOriginalFilename();
        String fileExtention = originalFileName.indexOf('.') > -1 ? originalFileName.substring(originalFileName.indexOf('.')) : "";
        String filename = DigestUtils.md2Hex(String.format("%s%d", baseString, atomicLong.incrementAndGet())).concat(fileExtention);
        String filePath = String.format("%s/%s", uploadDir, filename);
        try {
            byte[] data = multipartFile.getBytes();

            File uploadedFile = new File(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(uploadedFile));
            outputStream.write(data);
            outputStream.close();
            success = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return success ? filename : null;
    }

}
