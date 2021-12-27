package com.taniltekdemir.springboot.repository;

import com.taniltekdemir.springboot.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User>  findAllById(String userId);

}
