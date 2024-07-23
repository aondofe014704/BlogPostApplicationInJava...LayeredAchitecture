package com.semicolon.africa.blogpost.data.repositories;

import com.semicolon.africa.blogpost.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}
