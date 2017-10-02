package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "categories", schema = "movies_portal", catalog = "")
public class CategoriesEntity {
    private long categoryId;
    private Long categoryParent;
    private String categoryName;

    @Id
    @Column(name = "category_id", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_parent", nullable = true)
    public Long getCategoryParent() {
        return categoryParent;
    }

    public void setCategoryParent(Long categoryParent) {
        this.categoryParent = categoryParent;
    }

    @Basic
    @Column(name = "category_name", nullable = true, length = 250)
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesEntity that = (CategoriesEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryParent != null ? !categoryParent.equals(that.categoryParent) : that.categoryParent != null)
            return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (categoryParent != null ? categoryParent.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }
}
