package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "post_video_meta", schema = "movies_portal", catalog = "")
@IdClass(PostVideoMetaEntityPK.class)
public class PostVideoMetaEntity {
    private long postId;
    private long videoId;
    private long partNum;

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Id
    @Column(name = "video_id", nullable = false)
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Id
    @Column(name = "part_num", nullable = false)
    public long getPartNum() {
        return partNum;
    }

    public void setPartNum(long partNum) {
        this.partNum = partNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostVideoMetaEntity that = (PostVideoMetaEntity) o;

        if (postId != that.postId) return false;
        if (videoId != that.videoId) return false;
        if (partNum != that.partNum) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (videoId ^ (videoId >>> 32));
        result = 31 * result + (int) (partNum ^ (partNum >>> 32));
        return result;
    }
}
