package portal.movies.common;

import java.util.HashMap;
import java.util.Map;

public class File {
    public static final int PHOTO = 1;
    public static final int VIDEO = 2;
    public static final int SUBTITLE = 3;
    public static final int ATTACH = 4;
    public static final int VIDEO_SD = 5;
    public static final int VIDEO_HD = 6;
    public static final int VIDEO_FULL_HD = 7;

    public static final Map<Integer, String> TYPES = new HashMap<Integer, String>() {{
        put(PHOTO, "Photo");
        put(VIDEO, "Video");
        put(SUBTITLE, "Subtitle");
        put(ATTACH, "Attach");
    }};

    public static final Map<Integer, String> VIDEO_QUALITIES = new HashMap<Integer, String>() {{
        put(VIDEO_SD, "SD");
        put(VIDEO_HD, "HD");
        put(VIDEO_FULL_HD, "FULL HD");
    }};
}
