package portal.movies.common.servies;

import java.util.List;

public interface TagService {
    /**
     * @param input string seperated by comma,
     * @return list string
     * @author root
     */
    List<String> Text2Tags(String input);
}
