package com.example.facebook.repository;

import com.example.facebook.pojo.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    List<Post> findAll();
    Post findPostById(Integer id);

    //    @Query(
//        value = "SELECT * " +
//                "FROM comment c " +
//                "JOIN post p ON c.post_id = p.id" +
//                "WHERE c.post_id = :postId " +
//                "AND c.text = :text",
//        nativeQuery = true)

    // JPQL
    @Query(
            "SELECT p FROM Post p " +
                    "JOIN FETCH Comment c ON c.post.id = p.id " +
                    "WHERE p.text = :text " +
                    "AND c.id = :commentId "
    )
    List<Post> findPostsByTextAndCommentId(@Param("text") String text,
                                             @Param("commentId") Integer commentId);
}
