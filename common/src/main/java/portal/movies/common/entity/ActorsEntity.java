package portal.movies.common.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "actors", schema = "movies_portal", catalog = "")
public class ActorsEntity {
    private long actorId;
    private String actorName;
    private Timestamp actorDayOfBirth;
    private Long actorPhotoId;
    private String actorNickname;
    private String actorAddress;
    private String actorOthers;

    @Id
    @Column(name = "actor_id", nullable = false)
    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    @Basic
    @Column(name = "actor_name", nullable = true, length = 250)
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Basic
    @Column(name = "actor_day_of_birth", nullable = true)
    public Timestamp getActorDayOfBirth() {
        return actorDayOfBirth;
    }

    public void setActorDayOfBirth(Timestamp actorDayOfBirth) {
        this.actorDayOfBirth = actorDayOfBirth;
    }

    @Basic
    @Column(name = "actor_photo_id", nullable = true)
    public Long getActorPhotoId() {
        return actorPhotoId;
    }

    public void setActorPhotoId(Long actorPhotoId) {
        this.actorPhotoId = actorPhotoId;
    }

    @Basic
    @Column(name = "actor_nickname", nullable = true, length = 250)
    public String getActorNickname() {
        return actorNickname;
    }

    public void setActorNickname(String actorNickname) {
        this.actorNickname = actorNickname;
    }

    @Basic
    @Column(name = "actor_address", nullable = true, length = 250)
    public String getActorAddress() {
        return actorAddress;
    }

    public void setActorAddress(String actorAddress) {
        this.actorAddress = actorAddress;
    }

    @Basic
    @Column(name = "actor_others", nullable = true, length = -1)
    public String getActorOthers() {
        return actorOthers;
    }

    public void setActorOthers(String actorOthers) {
        this.actorOthers = actorOthers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActorsEntity that = (ActorsEntity) o;

        if (actorId != that.actorId) return false;
        if (actorName != null ? !actorName.equals(that.actorName) : that.actorName != null) return false;
        if (actorDayOfBirth != null ? !actorDayOfBirth.equals(that.actorDayOfBirth) : that.actorDayOfBirth != null)
            return false;
        if (actorPhotoId != null ? !actorPhotoId.equals(that.actorPhotoId) : that.actorPhotoId != null) return false;
        if (actorNickname != null ? !actorNickname.equals(that.actorNickname) : that.actorNickname != null)
            return false;
        if (actorAddress != null ? !actorAddress.equals(that.actorAddress) : that.actorAddress != null) return false;
        if (actorOthers != null ? !actorOthers.equals(that.actorOthers) : that.actorOthers != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (actorId ^ (actorId >>> 32));
        result = 31 * result + (actorName != null ? actorName.hashCode() : 0);
        result = 31 * result + (actorDayOfBirth != null ? actorDayOfBirth.hashCode() : 0);
        result = 31 * result + (actorPhotoId != null ? actorPhotoId.hashCode() : 0);
        result = 31 * result + (actorNickname != null ? actorNickname.hashCode() : 0);
        result = 31 * result + (actorAddress != null ? actorAddress.hashCode() : 0);
        result = 31 * result + (actorOthers != null ? actorOthers.hashCode() : 0);
        return result;
    }
}
