package portal.movies.common.servies.impl;

import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.servies.IBiz;
import portal.movies.common.servies.TagService;

import java.util.List;

public class Biz implements IBiz {

    private TagService tagService = TagServiceImpl.getInstance();

    @Override
    public boolean upload(MultipartFile file, int type) {
        return false;
    }

    @Override
    public List<String> Text2Tags(String input) {
        return tagService.Text2Tags(input);
    }
}
