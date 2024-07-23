package com.semicolon.africa.blogpost.dto.requests;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SharePostRequest {
    private String postAuthorId;
    private String postRecipientsId;
    private String postId;
}
