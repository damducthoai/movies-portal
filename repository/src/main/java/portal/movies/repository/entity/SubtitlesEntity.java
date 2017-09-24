package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "subtitles", schema = "movies_portal", catalog = "")
public class SubtitlesEntity {
    private long subtitleId;
    private String subtitleName;
    private String subtitleDescription;
    private String subtitleFileName;

    @Id
    @Column(name = "subtitle_id", nullable = false)
    public long getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(long subtitleId) {
        this.subtitleId = subtitleId;
    }

    @Basic
    @Column(name = "subtitle_name", nullable = true, length = 255)
    public String getSubtitleName() {
        return subtitleName;
    }

    public void setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
    }

    @Basic
    @Column(name = "subtitle_description", nullable = true, length = -1)
    public String getSubtitleDescription() {
        return subtitleDescription;
    }

    public void setSubtitleDescription(String subtitleDescription) {
        this.subtitleDescription = subtitleDescription;
    }

    @Basic
    @Column(name = "subtitle_file_name", nullable = true, length = 255)
    public String getSubtitleFileName() {
        return subtitleFileName;
    }

    public void setSubtitleFileName(String subtitleFileName) {
        this.subtitleFileName = subtitleFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubtitlesEntity that = (SubtitlesEntity) o;

        if (subtitleId != that.subtitleId) return false;
        if (subtitleName != null ? !subtitleName.equals(that.subtitleName) : that.subtitleName != null) return false;
        if (subtitleDescription != null ? !subtitleDescription.equals(that.subtitleDescription) : that.subtitleDescription != null)
            return false;
        if (subtitleFileName != null ? !subtitleFileName.equals(that.subtitleFileName) : that.subtitleFileName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (subtitleId ^ (subtitleId >>> 32));
        result = 31 * result + (subtitleName != null ? subtitleName.hashCode() : 0);
        result = 31 * result + (subtitleDescription != null ? subtitleDescription.hashCode() : 0);
        result = 31 * result + (subtitleFileName != null ? subtitleFileName.hashCode() : 0);
        return result;
    }
}
