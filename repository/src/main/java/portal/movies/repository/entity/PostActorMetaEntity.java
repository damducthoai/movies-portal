package portal.movies.repository.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "post_actor_meta", schema = "movies_portal", catalog = "")
public class PostActorMetaEntity {
    private Long postId;
    private Long actorId;

    @Basic
    @Column(name = "post_id", nullable = true)
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "actor_id", nullable = true)
    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostActorMetaEntity that = (PostActorMetaEntity) o;

        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (actorId != null ? !actorId.equals(that.actorId) : that.actorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (actorId != null ? actorId.hashCode() : 0);
        return result;
    }
}
