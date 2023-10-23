package week9.te.facebook.service;

import week9.te.facebook.pojo.Comment;
import week9.te.facebook.pojo.Post;
import week9.te.facebook.pojo.User;

import java.util.List;
import java.util.Map;

public interface PostService {

    List<Map<String, String>> findAll();
    Post create(Integer id, String text, User user);
    void delete(Integer id, User user);
    void like(Integer id, User user);
    void comment(Comment comment);

}
