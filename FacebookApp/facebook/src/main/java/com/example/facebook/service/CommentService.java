package com.example.facebook.service;

import com.example.facebook.pojo.Comment;
import com.example.facebook.pojo.CreateInput;

import java.util.ArrayList;

public interface CommentService {

    Comment create(Integer postId, CreateInput input);
}
