package portal.movies.common.jpa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portal.movies.common.entity.FilesEntity;

@Repository
@Qualifier("filesRepository")
public interface FilesRepository extends JpaRepository<FilesEntity, Long> {
}
