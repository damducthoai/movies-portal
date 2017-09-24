package porta.movies.repository;

import com.sun.javafx.geom.transform.Identity;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity(name = "Message")
@Table(name = "msg")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "message")
    private String msg;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
