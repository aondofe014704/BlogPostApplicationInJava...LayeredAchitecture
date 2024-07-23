package com.semicolon.africa.blogpost.services;

import com.semicolon.africa.blogpost.data.model.Post;
import com.semicolon.africa.blogpost.dto.requests.CommentRequest;
import com.semicolon.africa.blogpost.dto.requests.SharePostRequest;
import com.semicolon.africa.blogpost.dto.requests.UserRequest;
import com.semicolon.africa.blogpost.dto.responses.CommentResponse;
import com.semicolon.africa.blogpost.dto.responses.UserResponse;
import com.semicolon.africa.blogpost.dto.responses.sharePostResponse;
import org.springframework.stereotype.Service;


public interface UserService {
    UserResponse signUp (UserRequest userRequest);
    CommentResponse commentToPost (CommentRequest commentRequest);
    CommentResponse deleteToComment (CommentRequest commentRequest);
    sharePostResponse sharePost (SharePostRequest sharePostRequest);

}
