package portal.movies.common.servies.impl;

import org.springframework.web.multipart.MultipartFile;
import portal.movies.common.servies.FileManager;
import portal.movies.common.servies.IBiz;
import portal.movies.common.servies.TagService;
import portal.movies.common.servies.UploadService;

import java.io.File;
import java.util.List;

public class Biz implements IBiz {

    private static Biz ourInstance = new Biz();

    private Biz() {
    }

    public static Biz getInstance() {
        return ourInstance;
    }

    private TagService tagService;

    private FileManager fileManager;

    private UploadService uploadService;

    @Override
    public List<String> Text2Tags(String input) {
        return tagService.Text2Tags(input);
    }

    @Override
    public boolean upload2VideoRepo(File file) {
        return fileManager.upload2VideoRepo(file);
    }

    @Override
    public boolean upload2PhotoRepo(File file) {
        return fileManager.upload2PhotoRepo(file);
    }

    @Override
    public boolean upload2SubtitleRepo(File file) {
        return fileManager.upload2SubtitleRepo(file);
    }

    @Override
    public boolean upload2AttatchRepo(File file) {
        return fileManager.upload2AttatchRepo(file);
    }

    public void setTagService(TagService tagService) {
        this.tagService = tagService;
    }

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public void setUploadService(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @Override
    public String httpUpload(MultipartFile multipartFile) {
        return uploadService.httpUpload(multipartFile);
    }
}
