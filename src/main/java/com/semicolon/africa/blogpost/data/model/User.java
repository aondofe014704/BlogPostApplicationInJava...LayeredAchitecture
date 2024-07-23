package com.semicolon.africa.blogpost.data.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@RequiredArgsConstructor
@Document
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
}
