package portal.movies.common.servies.impl;

import portal.movies.common.servies.TagService;

import java.util.Arrays;
import java.util.List;

public class TagServiceImpl implements TagService {

    public TagServiceImpl() {
    }

    @Override
    public List<String> Text2Tags(String input) {
        String[] tags = input.split(",");
        return Arrays.asList(tags);
    }
}
