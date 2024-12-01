package com.example.facebook.controller;

import com.example.facebook.pojo.CreateInput;
import com.example.facebook.pojo.EditPostInput;
import com.example.facebook.pojo.Post;
import com.example.facebook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public List<Post> getAll() {
        return postService.findAll();
    }

    @GetMapping("/post/{id}")
    public Post getOneById(@PathVariable Integer id) {
        return postService.findOneById(id);
    }

    @PostMapping("/post")
    public Post create(@RequestBody CreateInput input) {
        String newPostText = input.getText();
        Integer newPostUserId = input.getUserId();

        return postService.create(newPostText, newPostUserId);
    }

    @PutMapping("/post/{id}")
    public Post edit(@PathVariable Integer id,
                     @RequestBody EditPostInput input) {
        return postService.edit(id, input.getText());
    }

    @DeleteMapping("/post/{id}")
    public void delete(@PathVariable Integer id) {
        postService.delete(id);
    }

    @PostMapping("/post/{id}/like")
    public Post like(@PathVariable Integer id) {
        return postService.like(id, null);
    }

}
