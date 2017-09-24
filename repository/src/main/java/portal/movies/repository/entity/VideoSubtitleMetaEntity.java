package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "video_subtitle_meta", schema = "movies_portal", catalog = "")
@IdClass(VideoSubtitleMetaEntityPK.class)
public class VideoSubtitleMetaEntity {
    private long videoId;
    private long subtitleId;

    @Id
    @Column(name = "video_id", nullable = false)
    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    @Id
    @Column(name = "subtitle_id", nullable = false)
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

        VideoSubtitleMetaEntity that = (VideoSubtitleMetaEntity) o;

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
