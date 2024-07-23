package com.semicolon.africa.blogpost.services.Implementation;

import com.semicolon.africa.blogpost.data.model.Post;
import com.semicolon.africa.blogpost.data.repositories.PostRepository;
import com.semicolon.africa.blogpost.services.PostServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImplementation implements PostServices {

    private final PostRepository postRepository;

    @Override
    public Post addPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(String id, String newTitle, String newContent) {
        Post post = postRepository.findPostById(id);
        post.setTitle(newTitle);
        post.setContent(newContent);
        return postRepository.save(post);
    }

    @Override
    public String deletePost(String id) {
        Post post = postRepository.findPostById(id);
        postRepository.delete(post);
        return "Post deleted Successfully";
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}