package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TagsMetaEntityPK implements Serializable {
    private long tagId;
    private int metaType;

    @Column(name = "tag_id", nullable = false)
    @Id
    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    @Column(name = "meta_type", nullable = false)
    @Id
    public int getMetaType() {
        return metaType;
    }

    public void setMetaType(int metaType) {
        this.metaType = metaType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TagsMetaEntityPK that = (TagsMetaEntityPK) o;

        if (tagId != that.tagId) return false;
        if (metaType != that.metaType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tagId ^ (tagId >>> 32));
        result = 31 * result + metaType;
        return result;
    }
}
