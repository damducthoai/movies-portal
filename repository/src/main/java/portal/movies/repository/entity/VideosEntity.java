package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "videos", schema = "movies_portal", catalog = "")
public class VideosEntity {
    private long videoId;
    private String videoName;
    private String videoDescription;
    private String videoFileName;

    @Id
    @Column(name = "video_id", nullable = false)
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Basic
    @Column(name = "video_name", nullable = true, length = 255)
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    @Basic
    @Column(name = "video_description", nullable = true, length = -1)
    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    @Basic
    @Column(name = "video_file_name", nullable = true, length = 255)
    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideosEntity that = (VideosEntity) o;

        if (videoId != that.videoId) return false;
        if (videoName != null ? !videoName.equals(that.videoName) : that.videoName != null) return false;
        if (videoDescription != null ? !videoDescription.equals(that.videoDescription) : that.videoDescription != null)
            return false;
        if (videoFileName != null ? !videoFileName.equals(that.videoFileName) : that.videoFileName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (videoId ^ (videoId >>> 32));
        result = 31 * result + (videoName != null ? videoName.hashCode() : 0);
        result = 31 * result + (videoDescription != null ? videoDescription.hashCode() : 0);
        result = 31 * result + (videoFileName != null ? videoFileName.hashCode() : 0);
        return result;
    }
}
