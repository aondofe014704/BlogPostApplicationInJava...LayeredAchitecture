package com.semicolon.africa.blogpost.data.repositories;

import com.semicolon.africa.blogpost.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    Post findPostById(String id);
}
