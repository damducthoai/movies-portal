package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "tags_meta", schema = "movies_portal", catalog = "")
@IdClass(TagsMetaEntityPK.class)
public class TagsMetaEntity {
    private long tagId;
    private int metaType;

    @Id
    @Column(name = "tag_id", nullable = false)
    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    @Id
    @Column(name = "meta_type", nullable = false)
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

        TagsMetaEntity that = (TagsMetaEntity) o;

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
