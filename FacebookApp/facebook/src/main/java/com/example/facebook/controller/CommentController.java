package com.example.facebook.controller;

import com.example.facebook.pojo.Comment;
import com.example.facebook.pojo.CreateInput;
import com.example.facebook.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

//    @GetMapping("/comment")
//    public ArrayList<Comment> getAll() {
//        return commentService.findAll();
//    }

    @PostMapping("/comment/post/{postId}")
    public Comment comment(
            @PathVariable Integer postId,
            @RequestBody CreateInput input) {
        return commentService.create(postId, input);
    }
}
