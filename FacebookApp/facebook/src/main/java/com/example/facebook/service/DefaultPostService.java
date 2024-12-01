package com.example.facebook.service;

import com.example.facebook.pojo.Post;
import com.example.facebook.pojo.User;
import com.example.facebook.repository.PostFileRepository;
import com.example.facebook.repository.PostRepository;
import com.example.facebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultPostService implements PostService {


    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findOneById(Integer id) {
        return postRepository.findPostById(id);
    }

    @Override
    public ArrayList<Post> findAllByUser() {
        return null;
    }

    @Override
    public Post create(String text, Integer userId) {
        User user = userRepository.findUserById(userId);

        Post post = new Post();
        post.setText(text);
        post.setUser(user);

        return postRepository.save(post);
    }

    @Override
    public Post edit(Integer id, String text) {
        Post post = postRepository.findPostById(id);
        if (post != null) {
            post.setText(text);
            return postRepository.save(post);
        }

        return null;
    }

    @Override
    public void delete(Integer id) {
        postRepository.deleteById(id);
    }

    @Override
    public Post like(Integer id, User user) {
        Post post = postRepository.findPostById(id);
        if (post != null) {
            post.incrementLikes();
            return postRepository.save(post);
        }

        return null;
    }
}
