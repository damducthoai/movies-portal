package portal.movies.common.dao;

import portal.movies.common.entity.FilesEntity;

public interface FilesDAO {
    void saveFile(FilesEntity file);

    void deleteFileById(long id);

    void updateFile(FilesEntity file);

    FilesEntity findFileById(long id);
}
