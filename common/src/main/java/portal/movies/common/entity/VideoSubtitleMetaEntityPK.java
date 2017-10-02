package portal.movies.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class VideoSubtitleMetaEntityPK implements Serializable {
    private long fileVideoId;
    private long fileSubtitleId;

    @Column(name = "file_video_id", nullable = false)
    @Id
    public long getFileVideoId() {
        return fileVideoId;
    }

    public void setFileVideoId(long fileVideoId) {
        this.fileVideoId = fileVideoId;
    }

    @Column(name = "file_subtitle_id", nullable = false)
    @Id
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

        VideoSubtitleMetaEntityPK that = (VideoSubtitleMetaEntityPK) o;

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
