package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "conpains", schema = "movies_portal", catalog = "")
public class ConpainsEntity {
    private long complainId;
    private String complainContent;
    private Integer complainType;
    private Long compaintReferenceId;

    @Id
    @Column(name = "complain_id", nullable = false)
    public long getComplainId() {
        return complainId;
    }

    public void setComplainId(long complainId) {
        this.complainId = complainId;
    }

    @Basic
    @Column(name = "complain_content", nullable = true, length = -1)
    public String getComplainContent() {
        return complainContent;
    }

    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent;
    }

    @Basic
    @Column(name = "complain_type", nullable = true)
    public Integer getComplainType() {
        return complainType;
    }

    public void setComplainType(Integer complainType) {
        this.complainType = complainType;
    }

    @Basic
    @Column(name = "compaint_reference_id", nullable = true)
    public Long getCompaintReferenceId() {
        return compaintReferenceId;
    }

    public void setCompaintReferenceId(Long compaintReferenceId) {
        this.compaintReferenceId = compaintReferenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConpainsEntity that = (ConpainsEntity) o;

        if (complainId != that.complainId) return false;
        if (complainContent != null ? !complainContent.equals(that.complainContent) : that.complainContent != null)
            return false;
        if (complainType != null ? !complainType.equals(that.complainType) : that.complainType != null) return false;
        if (compaintReferenceId != null ? !compaintReferenceId.equals(that.compaintReferenceId) : that.compaintReferenceId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (complainId ^ (complainId >>> 32));
        result = 31 * result + (complainContent != null ? complainContent.hashCode() : 0);
        result = 31 * result + (complainType != null ? complainType.hashCode() : 0);
        result = 31 * result + (compaintReferenceId != null ? compaintReferenceId.hashCode() : 0);
        return result;
    }
}
