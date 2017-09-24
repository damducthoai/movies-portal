package portal.movies.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "authorities", schema = "movies_portal", catalog = "")
@IdClass(AuthoritiesEntityPK.class)
public class AuthoritiesEntity {
    private long userId;
    private String authority;

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "authority", nullable = false, length = 255)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthoritiesEntity that = (AuthoritiesEntity) o;

        if (userId != that.userId) return false;
        if (authority != null ? !authority.equals(that.authority) : that.authority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }
}
