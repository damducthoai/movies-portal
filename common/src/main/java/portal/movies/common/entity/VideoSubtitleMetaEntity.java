package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "video_subtitle_meta", schema = "movies_portal", catalog = "")
@IdClass(VideoSubtitleMetaEntityPK.class)
public class VideoSubtitleMetaEntity {
    private long fileVideoId;
    private long fileSubtitleId;

    @Id
    @Column(name = "file_video_id", nullable = false)
    public long getFileVideoId() {
        return fileVideoId;
    }

    public void setFileVideoId(long fileVideoId) {
        this.fileVideoId = fileVideoId;
    }

    @Id
    @Column(name = "file_subtitle_id", nullable = false)
    public long getFileSubtitleId() {
        return fileSubtitleId;
    }

    public void setFileSubtitleId(long fileSubtitleId) {
        this.fileSubtitleId = fileSubtitleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoSubtitleMetaEntity that = (VideoSubtitleMetaEntity) o;

        if (fileVideoId != that.fileVideoId) return false;
        if (fileSubtitleId != that.fileSubtitleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fileVideoId ^ (fileVideoId >>> 32));
        result = 31 * result + (int) (fileSubtitleId ^ (fileSubtitleId >>> 32));
        return result;
    }
}
