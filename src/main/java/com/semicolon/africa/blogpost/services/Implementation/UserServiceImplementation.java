package com.semicolon.africa.blogpost.services.Implementation;

import com.semicolon.africa.blogpost.data.model.Comment;
import com.semicolon.africa.blogpost.data.model.Post;
import com.semicolon.africa.blogpost.data.model.User;
import com.semicolon.africa.blogpost.data.repositories.CommentRepository;
import com.semicolon.africa.blogpost.data.repositories.PostRepository;
import com.semicolon.africa.blogpost.data.repositories.UserRepository;
import com.semicolon.africa.blogpost.dto.requests.CommentRequest;
import com.semicolon.africa.blogpost.dto.requests.SharePostRequest;
import com.semicolon.africa.blogpost.dto.requests.UserRequest;
import com.semicolon.africa.blogpost.dto.responses.CommentResponse;
import com.semicolon.africa.blogpost.dto.responses.UserResponse;
import com.semicolon.africa.blogpost.dto.responses.sharePostResponse;
import com.semicolon.africa.blogpost.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;


    @Override
    public UserResponse signUp(UserRequest userRequest) {
        User user = new User();
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setName(userRequest.getUsername());
        return UserResponse.builder().email(userRequest.getEmail())
                .name(userRequest.getUsername()).build();
    }

    @Override
    public CommentResponse commentToPost(CommentRequest commentRequest) {
        Post post = postRepository.findPostById(commentRequest.getPostId());
        Comment comment = new Comment();
        User user = userRepository.findUserById(commentRequest.getCommenterId());
        comment.setCommenter(user);
        comment.setComment(commentRequest.getComment());
        post.setComments(new ArrayList<>());
        post.getComments().add(comment);
        commentRepository.save(comment);
        postRepository.save(post);
        return CommentResponse.builder().commenter(UserResponse.builder().name(user.getName())
                .email(user.getEmail()).build()).comment(commentRequest.getComment())
                .id(comment.getId()).build();
    }

    @Override
    public CommentResponse deleteToComment(CommentRequest commentRequest) {
        return null;
    }

    @Override
    public sharePostResponse sharePost(SharePostRequest sharePostRequest) {
        return null;
    }
}
