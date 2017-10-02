package portal.movies.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "rating", schema = "movies_portal", catalog = "")
public class RatingEntity {
    private long rateId;
    private Integer rateSize;
    private Long postId;
    private Long userId;
    private String clientName;
    private String clientEmail;
    private String clientIp;

    @Id
    @Column(name = "rate_id", nullable = false)
    public long getRateId() {
        return rateId;
    }

    public void setRateId(long rateId) {
        this.rateId = rateId;
    }

    @Basic
    @Column(name = "rate_size", nullable = true)
    public Integer getRateSize() {
        return rateSize;
    }

    public void setRateSize(Integer rateSize) {
        this.rateSize = rateSize;
    }

    @Basic
    @Column(name = "post_id", nullable = true)
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "client_name", nullable = true, length = 255)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "client_email", nullable = true, length = 255)
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Basic
    @Column(name = "client_ip", nullable = true, length = 255)
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingEntity that = (RatingEntity) o;

        if (rateId != that.rateId) return false;
        if (rateSize != null ? !rateSize.equals(that.rateSize) : that.rateSize != null) return false;
        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (clientEmail != null ? !clientEmail.equals(that.clientEmail) : that.clientEmail != null) return false;
        if (clientIp != null ? !clientIp.equals(that.clientIp) : that.clientIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (rateId ^ (rateId >>> 32));
        result = 31 * result + (rateSize != null ? rateSize.hashCode() : 0);
        result = 31 * result + (postId != null ? postId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (clientEmail != null ? clientEmail.hashCode() : 0);
        result = 31 * result + (clientIp != null ? clientIp.hashCode() : 0);
        return result;
    }
}
