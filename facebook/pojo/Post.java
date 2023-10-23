package week9.te.facebook.pojo;

import java.util.ArrayList;

public class Post {

    private Integer id;
    private String text;
    private PostType type;
    private User user; // The user that created the post
    private ArrayList<Comment> comments;
    private Integer numberOfLikes;
    private Integer numberOfShares;

    public Post(Integer id, String text, User user) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.type = PostType.NORMAL;
        this.comments = new ArrayList<Comment>();
        this.numberOfShares = 0;
        this.numberOfLikes = 0;
    }

    public Post(Integer id, String text, User user, PostType type) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.type = type;
        this.comments = new ArrayList<Comment>();
        this.numberOfShares = 0;
        this.numberOfLikes = 0;
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

    public PostType getType() {
        return type;
    }

    public void setType(PostType type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
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

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type=" + type +
                ", user=" + user +
                ", comments=" + comments +
                ", numberOfLikes=" + numberOfLikes +
                ", numberOfShares=" + numberOfShares +
                '}';
    }
}
