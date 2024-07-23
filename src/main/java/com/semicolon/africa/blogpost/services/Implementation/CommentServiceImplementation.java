package com.semicolon.africa.blogpost.services.Implementation;

import com.semicolon.africa.blogpost.data.model.Comment;
import com.semicolon.africa.blogpost.services.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CommentServiceImplementation implements CommentService {

    @Override
    public Comment addComment(String title, String text) {
        return null;
    }

    @Override
    public Comment updateComment(String postId, Comment comment) {
        return null;
    }

    @Override
    public Comment deleteComment(String postId, String commentId) {
        return null;
    }

    @Override
    public List<Comment> getAllCommentsByPostId(String postId) {
        return null;
    }
}
