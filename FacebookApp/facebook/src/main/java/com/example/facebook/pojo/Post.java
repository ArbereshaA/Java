package com.example.facebook.pojo;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private PostType type;

    @OneToMany(mappedBy = "post")
    @JsonManagedReference
    private List<Comment> comments;

    @Column(name = "number_of_likes")
    private Integer numberOfLikes;

    @Column(name = "number_of_shares")
    private Integer numberOfShares;

    public Post() {
        this.numberOfShares = 0;
        this.numberOfLikes = 0;
        this.type = PostType.NORMAL;
    }

    public Post(Integer id, String text, User user) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.type = PostType.NORMAL;
        this.comments = new ArrayList<>();
        this.numberOfLikes = 0;
        this.numberOfShares = 0;
    }

    public Post(Integer id, String text, Integer numberOfLikes, Integer numberOfShares) {
        this.id = id;
        this.text = text;
        this.numberOfLikes = numberOfLikes;
        this.numberOfShares = numberOfShares;
        this.type = PostType.NORMAL;
    }

    public Post(Integer id, String text, User user, PostType type) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.type = type;
        this.comments = new ArrayList<>();
        this.numberOfLikes = 0;
        this.numberOfShares = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PostType getType() {
        return type;
    }

    public void setType(PostType type) {
        this.type = type;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public Integer getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(Integer numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public void incrementLikes() {
        this.numberOfLikes += 1;
    }

    public String toCsvString() {
        return this.id + "," + this.text + "," + this.numberOfLikes + "," + this.numberOfShares;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", user=" + user +
                ", type=" + type +
                ", comments=" + comments +
                ", numberOfLikes=" + numberOfLikes +
                ", numberOfShares=" + numberOfShares +
                '}';
    }
}
