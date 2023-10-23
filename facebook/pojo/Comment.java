package week9.te.facebook.pojo;

public class Comment {

    private Integer id;
    private String text;
    private User user;
    private Integer numberOfLikes;

    public Comment(Integer id, String text, User user) {
        this.id = id;
        this.text = text;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}
