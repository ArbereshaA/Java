package week9.te.facebook.controller;

import week9.te.facebook.pojo.User;
import week9.te.facebook.service.DefaultPostService;
import week9.te.facebook.service.PostService;

public class Main {
    public static void main(String[] args) {
        PostService postService = new DefaultPostService();
        User user = new User(1, "Jon");
        User user2 = new User(2, "Mat");
        User user3 = new User(3, "Test");

        // Jon posts something in Facebook
        postService.create(1, "Hello There!", user);

        // Jon posts something else
        postService.create(2, "Post2", user);

        //Mat does a post in Facebook
        postService.create(3, "Post3", user2);

        // Matt likes Hello There! post
        postService.like(1, user2);
        postService.like(1, user3);

        System.out.println(postService.findAll());
    }
}
