package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PostActorMetaEntityPK implements Serializable {
    private long postId;
    private long actorId;

    @Column(name = "post_id", nullable = false)
    @Id
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Column(name = "actor_id", nullable = false)
    @Id
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

        PostActorMetaEntityPK that = (PostActorMetaEntityPK) o;

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
