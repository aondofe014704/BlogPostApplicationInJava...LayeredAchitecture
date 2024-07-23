package com.semicolon.africa.blogpost.services;

import com.semicolon.africa.blogpost.data.model.Post;

import java.util.List;

public interface PostServices {
    Post addPost(String title, String content );
    Post updatePost(String id, String newTitle, String newContent);
    String deletePost(String id);
    List<Post> getAllPosts();

}
