package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "tags_meta", schema = "movies_portal", catalog = "")
@IdClass(TagsMetaEntityPK.class)
public class TagsMetaEntity {
    private long tagId;
    private Long refencesId;
    private int metaType;

    @Id
    @Column(name = "tag_id", nullable = false)
    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    @Basic
    @Column(name = "refences_id", nullable = true)
    public Long getRefencesId() {
        return refencesId;
    }

    public void setRefencesId(Long refencesId) {
        this.refencesId = refencesId;
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
        if (refencesId != null ? !refencesId.equals(that.refencesId) : that.refencesId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (tagId ^ (tagId >>> 32));
        result = 31 * result + (refencesId != null ? refencesId.hashCode() : 0);
        result = 31 * result + metaType;
        return result;
    }
}
