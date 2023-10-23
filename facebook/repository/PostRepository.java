package week9.te.facebook.repository;

import week9.te.facebook.pojo.Post;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PostRepository {
    private String filename;

    public PostRepository() {
        this.filename = "posts.csv";
    }

    public void createPost(Map<String, String> post) {
        // Append the post data to the CSV file
        try (FileWriter writer = new FileWriter(filename, true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(post.get("id"));
            sb.append(",");
            sb.append(post.get("title"));
            sb.append(",");
            sb.append(post.get("body"));
            sb.append(",");
            sb.append(post.get("userId"));
            sb.append("\n");
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Map<String, String>> getPosts() {
        // Read the data from the CSV file and return a list of posts
        List<Map<String, String>> posts = new ArrayList<>();
        // TODO: Read from CSV file and add to posts list
        return posts;
    }

    public Post save(Post post) {
        return post;
    }

    public void like(Integer id) {
    }

    public List<Map<String, String>> readAll() {
        for (Map post : getPosts()) {
            return getPosts();
        }
        return null;
    }
}
