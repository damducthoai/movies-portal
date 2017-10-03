package portal.movies.common.dao.impl;

import portal.movies.common.dao.FilesDAO;
import portal.movies.common.entity.FilesEntity;
import portal.movies.common.jpa.FilesRepository;

import java.util.List;

public class FilesDAOImpl implements FilesDAO {

    private FilesRepository repository;

    public FilesDAOImpl() {
    }

    @Override
    public void saveFile(FilesEntity file) {
        repository.save(file);
    }

    @Override
    public void deleteFileById(long id) {
        repository.delete(id);
    }

    @Override
    public void updateFile(FilesEntity file) {
        repository.save(file);
    }

    @Override
    public FilesEntity findFileById(long id) {
        return repository.findOne(id);
    }

    @Override
    public List<FilesEntity> findAllFiles() {
        return repository.findAll();
    }

    public FilesRepository getRepository() {
        return repository;
    }

    public void setRepository(FilesRepository repository) {
        this.repository = repository;
    }
}
