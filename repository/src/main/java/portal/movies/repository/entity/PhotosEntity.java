package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "photos", schema = "movies_portal", catalog = "")
public class PhotosEntity {
    private long photoId;
    private String photoName;
    private String photoFileName;
    private String photoDescription;

    @Id
    @Column(name = "photo_id", nullable = false)
    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }

    @Basic
    @Column(name = "photo_name", nullable = true, length = 255)
    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Basic
    @Column(name = "photo_file_name", nullable = true, length = 255)
    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    @Basic
    @Column(name = "photo_description", nullable = true, length = -1)
    public String getPhotoDescription() {
        return photoDescription;
    }

    public void setPhotoDescription(String photoDescription) {
        this.photoDescription = photoDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotosEntity that = (PhotosEntity) o;

        if (photoId != that.photoId) return false;
        if (photoName != null ? !photoName.equals(that.photoName) : that.photoName != null) return false;
        if (photoFileName != null ? !photoFileName.equals(that.photoFileName) : that.photoFileName != null)
            return false;
        if (photoDescription != null ? !photoDescription.equals(that.photoDescription) : that.photoDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (photoId ^ (photoId >>> 32));
        result = 31 * result + (photoName != null ? photoName.hashCode() : 0);
        result = 31 * result + (photoFileName != null ? photoFileName.hashCode() : 0);
        result = 31 * result + (photoDescription != null ? photoDescription.hashCode() : 0);
        return result;
    }
}
