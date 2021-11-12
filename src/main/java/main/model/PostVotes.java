package main.model;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "post_votes")
public class PostVotes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id", insertable = false, updatable = false)
    private String userId;

    @Column(name = "post_id", insertable = false, updatable = false)
    private int postId;

    @Column(name = "time", nullable = false)
    private Date time;

    @Column(name = "value", nullable = false)
    private short value;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Posts post;
}
