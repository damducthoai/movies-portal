package portal.movies.common.servies;

import java.io.File;

public interface FileManager {
    /**
     * upload file to video repository
     *
     * @param file
     * @return success ? true : false
     * @author root
     */
    boolean upload2VideoRepo(File file);

    /**
     * upload file to photo repository
     * @param file
     * @return success ? true : false
     * @author root
     */
    boolean upload2PhotoRepo(File file);

    /**
     * upload file to subtitle repository
     * @param file
     * @return success ? true : false
     * @author root
     */
    boolean upload2SubtitleRepo(File file);

    /**
     * upload file to attach repository
     * @param file
     * @return success ? true : false
     * @author root
     */
    boolean upload2AttatchRepo(File file);
}
