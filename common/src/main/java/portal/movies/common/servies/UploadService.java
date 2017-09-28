package portal.movies.common.servies;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    /**
     * handle multipart single file upload from http form
     *
     * @param multipartFile
     * @return file name
     * @author root
     */
    String httpUpload(MultipartFile multipartFile);
}
