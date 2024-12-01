package com.example.facebook.service;

import com.example.facebook.pojo.Post;
import com.example.facebook.pojo.User;

import java.util.ArrayList;
import java.util.List;

public interface PostService {

    List<Post> findAll();
    Post findOneById(Integer id);
    List<Post> findAllByUser();
    Post create(String text, Integer userId);
    Post edit(Integer id, String text);
    void delete(Integer id);
    Post like(Integer id, User user);
}
