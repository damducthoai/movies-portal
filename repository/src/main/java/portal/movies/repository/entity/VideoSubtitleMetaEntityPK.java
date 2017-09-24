package portal.movies.repository.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class VideoSubtitleMetaEntityPK implements Serializable {
    private long videoId;
    private long subtitleId;

    @Column(name = "video_id", nullable = false)
    @Id
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Column(name = "subtitle_id", nullable = false)
    @Id
    public long getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(long subtitleId) {
        this.subtitleId = subtitleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoSubtitleMetaEntityPK that = (VideoSubtitleMetaEntityPK) o;

        if (videoId != that.videoId) return false;
        if (subtitleId != that.subtitleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (videoId ^ (videoId >>> 32));
        result = 31 * result + (int) (subtitleId ^ (subtitleId >>> 32));
        return result;
    }
}
