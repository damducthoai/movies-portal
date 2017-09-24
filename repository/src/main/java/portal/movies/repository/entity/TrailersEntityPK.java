package portal.movies.repository.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TrailersEntityPK implements Serializable {
    private long postId;
    private long videoId;

    @Column(name = "post_id", nullable = false)
    @Id
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Column(name = "video_id", nullable = false)
    @Id
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrailersEntityPK that = (TrailersEntityPK) o;

        if (postId != that.postId) return false;
        if (videoId != that.videoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (videoId ^ (videoId >>> 32));
        return result;
    }
}
