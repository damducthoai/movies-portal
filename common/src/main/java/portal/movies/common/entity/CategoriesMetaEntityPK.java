package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CategoriesMetaEntityPK implements Serializable {
    private long postId;
    private long categoryId;

    @Column(name = "post_id", nullable = false)
    @Id
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Column(name = "category_id", nullable = false)
    @Id
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

        CategoriesMetaEntityPK that = (CategoriesMetaEntityPK) o;

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
