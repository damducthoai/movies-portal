package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "categories_meta", schema = "movies_portal", catalog = "")
@IdClass(CategoriesMetaEntityPK.class)
public class CategoriesMetaEntity {
    private long postId;
    private long categoryId;

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Id
    @Column(name = "category_id", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriesMetaEntity that = (CategoriesMetaEntity) o;

        if (postId != that.postId) return false;
        if (categoryId != that.categoryId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        return result;
    }
}
