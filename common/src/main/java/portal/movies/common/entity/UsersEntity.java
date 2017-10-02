package portal.movies.common.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users", schema = "movies_portal", catalog = "")
public class UsersEntity {
    private long userId;
    private String userEmail;
    private String userPass;
    private String userName;
    private Timestamp userRegisted;
    private Integer userStatus;
    private String userActionKey;
    private String userUrl;

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_email", nullable = true, length = 100)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_pass", nullable = true, length = 255)
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 250)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_registed", nullable = true)
    public Timestamp getUserRegisted() {
        return userRegisted;
    }

    public void setUserRegisted(Timestamp userRegisted) {
        this.userRegisted = userRegisted;
    }

    @Basic
    @Column(name = "user_status", nullable = true)
    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "user_action_key", nullable = true, length = 255)
    public String getUserActionKey() {
        return userActionKey;
    }

    public void setUserActionKey(String userActionKey) {
        this.userActionKey = userActionKey;
    }

    @Basic
    @Column(name = "user_url", nullable = true, length = 250)
    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userRegisted != null ? !userRegisted.equals(that.userRegisted) : that.userRegisted != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        if (userActionKey != null ? !userActionKey.equals(that.userActionKey) : that.userActionKey != null)
            return false;
        if (userUrl != null ? !userUrl.equals(that.userUrl) : that.userUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userRegisted != null ? userRegisted.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (userActionKey != null ? userActionKey.hashCode() : 0);
        result = 31 * result + (userUrl != null ? userUrl.hashCode() : 0);
        return result;
    }
}
