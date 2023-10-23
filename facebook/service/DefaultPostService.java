package week9.te.facebook.service;

import week9.te.facebook.pojo.Comment;
import week9.te.facebook.pojo.Post;
import week9.te.facebook.pojo.User;
import week9.te.facebook.repository.PostRepository;

import java.util.List;
import java.util.Map;

public class DefaultPostService implements PostService {

    private PostRepository postRepository = new PostRepository();

    @Override
    public List<Map<String, String>> findAll() {
        return postRepository.readAll();
    }

    @Override
    public Post create(Integer id, String text, User user) {
        Post post = new Post(id, text, user);
        return postRepository.save(post);
    }

    @Override
    public void delete(Integer id, User user) {

    }

    @Override
    public void like(Integer id, User user) {
        // We check if user can like the post with id requested

        postRepository.like(id);
    }

    @Override
    public void comment(Comment comment) {

    }
}
