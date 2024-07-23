package com.semicolon.africa.blogpost.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@RequiredArgsConstructor
@Document
public class Comment {
    private String id;
    @DBRef
    private User commenter;
    private String comment;

}
