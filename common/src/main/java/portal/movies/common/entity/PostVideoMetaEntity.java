package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "post_video_meta", schema = "movies_portal", catalog = "")
@IdClass(PostVideoMetaEntityPK.class)
public class PostVideoMetaEntity {
    private long postId;
    private long fileVideoId;
    private long partNum;
    private Integer videoQuality;

    @Id
    @Column(name = "post_id", nullable = false)
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Id
    @Column(name = "file_video_id", nullable = false)
    public long getFileVideoId() {
        return fileVideoId;
    }

    public void setFileVideoId(long fileVideoId) {
        this.fileVideoId = fileVideoId;
    }

    @Id
    @Column(name = "part_num", nullable = false)
    public long getPartNum() {
        return partNum;
    }

    public void setPartNum(long partNum) {
        this.partNum = partNum;
    }

    @Basic
    @Column(name = "video_quality", nullable = true)
    public Integer getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(Integer videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostVideoMetaEntity that = (PostVideoMetaEntity) o;

        if (postId != that.postId) return false;
        if (fileVideoId != that.fileVideoId) return false;
        if (partNum != that.partNum) return false;
        if (videoQuality != null ? !videoQuality.equals(that.videoQuality) : that.videoQuality != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (postId ^ (postId >>> 32));
        result = 31 * result + (int) (fileVideoId ^ (fileVideoId >>> 32));
        result = 31 * result + (int) (partNum ^ (partNum >>> 32));
        result = 31 * result + (videoQuality != null ? videoQuality.hashCode() : 0);
        return result;
    }
}
