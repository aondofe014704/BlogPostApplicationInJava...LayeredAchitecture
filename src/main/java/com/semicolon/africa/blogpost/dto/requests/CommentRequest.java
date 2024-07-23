package com.semicolon.africa.blogpost.dto.requests;

import com.semicolon.africa.blogpost.data.model.User;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentRequest {
    private String commenterId;
    private String comment;
    private String postId;
}
