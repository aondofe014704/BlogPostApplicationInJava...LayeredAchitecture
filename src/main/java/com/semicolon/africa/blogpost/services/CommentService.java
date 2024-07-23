package com.semicolon.africa.blogpost.services;

import com.semicolon.africa.blogpost.data.model.Comment;

import java.util.List;

public interface CommentService {
    Comment addComment(String title, String text);
    Comment updateComment(String postId, Comment comment);
    Comment deleteComment(String postId, String commentId);
    List<Comment> getAllCommentsByPostId(String postId);
}
