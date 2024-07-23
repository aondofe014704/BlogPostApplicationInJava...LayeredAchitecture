package com.semicolon.africa.blogpost.dto.responses;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentResponse {
    private String id;
    private String comment;
    private UserResponse commenter;


}
