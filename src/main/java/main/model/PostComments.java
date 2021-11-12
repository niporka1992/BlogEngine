package main.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "post_comments")
public class PostComments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @Column(name = "post_id", nullable = false, insertable = false, updatable = false)
    private int postId;

    @Column(name = "user_id", nullable = false,insertable = false,updatable = false)
    private int userId;

    @Column(name = "time", nullable = false)
    private Date date;

    @Column(name = "text", nullable = false)
    private String text;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Posts post;
}
