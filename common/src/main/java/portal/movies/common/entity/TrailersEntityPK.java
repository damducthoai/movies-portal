package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TrailersEntityPK implements Serializable {
    private long postId;
    private long fileVideoId;

    @Column(name = "post_id", nullable = false)
    @Id
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Column(name = "file_video_id", nullable = false)
    @Id
    public long getFileVideoId() {
        return fileVideoId;
    }

    public void setFileVideoId(long fileVideoId) {
        this.fileVideoId = fileVideoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrailersEntityPK that = (TrailersEntityPK) o;

        if (postId != that.postId) return false;
        if (fileVideoId != that.fileVideoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (fileVideoId ^ (fileVideoId >>> 32));
        return result;
    }
}
