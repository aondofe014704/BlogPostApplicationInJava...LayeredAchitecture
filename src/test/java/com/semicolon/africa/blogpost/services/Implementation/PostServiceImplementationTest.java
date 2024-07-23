package com.semicolon.africa.blogpost.services.Implementation;

import com.semicolon.africa.blogpost.data.model.Post;
import com.semicolon.africa.blogpost.data.repositories.PostRepository;
import com.semicolon.africa.blogpost.services.PostServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PostServiceImplementationTest {
    @Autowired
    private PostServices postServices;
    @Autowired
    private PostRepository postRepository;
    @BeforeEach
    void setUp() {
        postRepository.deleteAll();
    }
    @Test
    void addPost() {
       Post post = postServices.addPost("PostTitle", "PostContent");
        assertThat(post.getId()).isNotNull();
    }

    @Test
    void update() {
        Post post = postServices.addPost("Real Title","Real Content");
        postServices.updatePost(post.getId(),"NewTitle", "NewContent");
        assertThat(postRepository.findPostById(post.getId())).isNotNull();
        assertThat(postRepository.findPostById(post.getId()).getTitle()).isEqualTo("NewTitle");
    }

    @Test
    public void   deletePost() {
        Post post = postServices.addPost("Deleted Title","Deleted Content");
        postServices.deletePost(post.getId());
        assertThat(postRepository.findPostById(post.getId())).isNull();


    }

    @Test
    void getAllPosts() {
        Post post = postServices.addPost("Deleted Title","Deleted Content");
        assertThat(postServices.getAllPosts()).hasSize(1);
    }
}