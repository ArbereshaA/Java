package com.example.facebook.repository;

import com.example.facebook.pojo.Post;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostFileRepository {

    // In memory
//    static ArrayList<Post> postsInDB = new ArrayList<>();
//    static ArrayList<Post> postsInDB = readFromFile();



    // In CSV file

    public ArrayList<Post> findAll() {
        //Read from CSV File
        return readFromFile();
    }

    public Post findOneById(Integer id) {
        for (Post post: readFromFile()) {
            if (post.getId().equals(id)) {
                return post;
            }
        }
        return null;
    }

    public Post save(Post post) {
        try {
            FileWriter writer = new FileWriter("posts.csv", true);
            writer.write(post.toCsvString());
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
//        postsInDB.add(post);
        return post;
    }

    public Post edit(Integer id, String text) {
        ArrayList<Post> allPosts = readFromFile();
        for (Post post: allPosts) {
            if (post.getId().equals(id)) {
                post.setText(text);
                recreateCsvFile(allPosts);
                return post;
            }
        }

        return null;
    }

    public void delete(Integer id) {
        ArrayList<Post> allPosts = readFromFile();
        for (Post post: allPosts) {
            if (post.getId().equals(id)) {
                allPosts.remove(post);
                recreateCsvFile(allPosts);
            }
        }

    }

    private void recreateCsvFile(ArrayList<Post> allPosts) {
        try {
            FileWriter writer = new FileWriter("posts.csv");
            for (Post post: allPosts) {
                writer.write(post.toCsvString());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public Post like(Integer id) {
        for (Post post: readFromFile()) {
            if (post.getId().equals(id)) {
                post.incrementLikes();
                return post;
            }
        }
        return null;
    }

    private static ArrayList<Post> readFromFile() {
        ArrayList<Post> posts = new ArrayList<>();
        try {
            File file = new File("posts.csv");
            Scanner reader = new Scanner(file);

            while (reader.hasNext()) {
                String row = reader.nextLine();
                String[] postData = row.split(",");
                Post post = new Post(Integer.valueOf(postData[0]),
                        postData[1],
                        Integer.valueOf(postData[2]),
                        Integer.valueOf(postData[3]));

                posts.add(post);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }

        return posts;
    }

}
