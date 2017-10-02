package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UrlMetaEntityPK implements Serializable {
    private String urlData;
    private int urlType;

    @Column(name = "url_data", nullable = false, length = 255)
    @Id
    public String getUrlData() {
        return urlData;
    }

    public void setUrlData(String urlData) {
        this.urlData = urlData;
    }

    @Column(name = "url_type", nullable = false)
    @Id
    public int getUrlType() {
        return urlType;
    }

    public void setUrlType(int urlType) {
        this.urlType = urlType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UrlMetaEntityPK that = (UrlMetaEntityPK) o;

        if (urlType != that.urlType) return false;
        if (urlData != null ? !urlData.equals(that.urlData) : that.urlData != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = urlData != null ? urlData.hashCode() : 0;
        result = 31 * result + urlType;
        return result;
    }
}
