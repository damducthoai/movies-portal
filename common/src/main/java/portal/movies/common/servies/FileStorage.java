package portal.movies.common.servies;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorage {
    /**
     * this function upload file and stored in server repository
     *
     * @param file
     * @param type
     * @return uploadSuccess ? true : false
     */
    boolean upload(MultipartFile file, int type);
}
