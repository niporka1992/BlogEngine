package main.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "tags")
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name",nullable = false)
    private String name;

    @ManyToMany
    @JoinTable (name="tag2post",
            joinColumns=@JoinColumn (name="tag_id"),
            inverseJoinColumns=@JoinColumn(name="post_id"))
    private List<Posts> posts;
}
