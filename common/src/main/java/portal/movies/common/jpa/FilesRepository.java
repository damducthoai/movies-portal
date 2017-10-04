package portal.movies.common.jpa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import portal.movies.common.entity.FilesEntity;

import java.util.List;

@Repository
@Qualifier("filesRepository")
public interface FilesRepository extends JpaRepository<FilesEntity, Long> {

    @Query(value = "select * from  files ORDER BY file_id DESC limit :pageSize OFFSET :pageOffset", nativeQuery = true)
    List<FilesEntity> getFiles(@Param("pageSize") long pageSize, @Param("pageOffset") long pageOffset);

    @Query(value = "select * from  files WHERE file_type = :fileType ORDER BY file_id DESC limit :pageSize OFFSET :pageOffset", nativeQuery = true)
    List<FilesEntity> getFiles(@Param("pageSize") long pageSize, @Param("pageOffset") long pageOffset, @Param("fileType") int fileType);
}
