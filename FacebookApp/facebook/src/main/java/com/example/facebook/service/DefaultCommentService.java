package com.example.facebook.service;

import com.example.facebook.pojo.Comment;
import com.example.facebook.pojo.CreateInput;
import com.example.facebook.pojo.Post;
import com.example.facebook.pojo.User;
import com.example.facebook.repository.CommentRepository;
import com.example.facebook.repository.PostRepository;
import com.example.facebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DefaultCommentService implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public Comment create(Integer postId, CreateInput input) {
        User user = userRepository.findUserById(input.getUserId());
        Post post = postRepository.findPostById(postId);

        Comment comment = new Comment();
        comment.setText(input.getText());
        comment.setUser(user);
        comment.setPost(post);

        return commentRepository.save(comment);
    }
}
