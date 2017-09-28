package portal.movies.common.servies;

import java.io.File;

public interface FileManager {
    boolean upload2VideoRepo(File file);

    boolean upload2PhotoRepo(File file);

    boolean upload2SubtitleRepo(File file);

    boolean upload2AttatchRepo(File file);
}
