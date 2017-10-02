package portal.movies.common.servies;

import java.io.File;

public interface FileManager {
    /**
     * upload file to video repository
     *
     * @param file
     * @return success ? file url : null
     * @author root
     */
    String upload2VideoRepo(File file);

    /**
     * upload file to photo repository
     * @param file
     * @return success ? file url : null
     * @author root
     */
    String upload2PhotoRepo(File file);

    /**
     * upload file to subtitle repository
     * @param file
     * @return success ? file url : null
     * @author root
     */
    String upload2SubtitleRepo(File file);

    /**
     * upload file to attach repository
     * @param file
     * @return success ? file url : null
     * @author root
     */
    String upload2AttatchRepo(File file);
}
