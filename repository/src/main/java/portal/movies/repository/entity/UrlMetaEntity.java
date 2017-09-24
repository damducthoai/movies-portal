package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "url_meta", schema = "movies_portal", catalog = "")
@IdClass(UrlMetaEntityPK.class)
public class UrlMetaEntity {
    private String urlData;
    private int urlType;
    private Long mediaId;

    @Id
    @Column(name = "url_data", nullable = false, length = 255)
    public String getUrlData() {
        return urlData;
    }

    public void setUrlData(String urlData) {
        this.urlData = urlData;
    }

    @Id
    @Column(name = "url_type", nullable = false)
    public int getUrlType() {
        return urlType;
    }

    public void setUrlType(int urlType) {
        this.urlType = urlType;
    }

    @Basic
    @Column(name = "media_id", nullable = true)
    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrlMetaEntity that = (UrlMetaEntity) o;

        if (urlType != that.urlType) return false;
        if (urlData != null ? !urlData.equals(that.urlData) : that.urlData != null) return false;
        if (mediaId != null ? !mediaId.equals(that.mediaId) : that.mediaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlData != null ? urlData.hashCode() : 0;
        result = 31 * result + urlType;
        result = 31 * result + (mediaId != null ? mediaId.hashCode() : 0);
        return result;
    }
}
