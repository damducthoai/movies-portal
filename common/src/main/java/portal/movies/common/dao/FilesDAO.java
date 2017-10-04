package portal.movies.common.dao;

import portal.movies.common.entity.FilesEntity;

import java.util.List;

public interface FilesDAO {
    void saveFile(FilesEntity file);

    void deleteFileById(long id);

    void updateFile(FilesEntity file);

    FilesEntity findFileById(long id);

    List<FilesEntity> findAllFiles();

    /**
     * paging support
     *
     * @param pageNum  page number
     * @param pageSize number of item per return
     * @param fileType 0: all, other view Files.class
     * @return list of files
     */
    List<FilesEntity> getFiles(long pageNum, long pageSize, int fileType);
}
