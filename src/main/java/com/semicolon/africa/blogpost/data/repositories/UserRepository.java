package com.semicolon.africa.blogpost.data.repositories;

import com.semicolon.africa.blogpost.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserByEmail(String email);
    User findUserByName(String username);
    User findUserById(String id);
}
