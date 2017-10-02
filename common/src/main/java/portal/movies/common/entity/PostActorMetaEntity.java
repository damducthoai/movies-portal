package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "post_actor_meta", schema = "movies_portal", catalog = "")
@IdClass(PostActorMetaEntityPK.class)
public class PostActorMetaEntity {
    private long postId;
    private long actorId;

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Id
    @Column(name = "actor_id", nullable = false)
    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostActorMetaEntity that = (PostActorMetaEntity) o;

        if (postId != that.postId) return false;
        if (actorId != that.actorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (actorId ^ (actorId >>> 32));
        return result;
    }
}
