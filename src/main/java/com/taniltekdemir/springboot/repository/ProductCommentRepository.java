package com.taniltekdemir.springboot.repository;

import com.taniltekdemir.springboot.entitiy.ProductComment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductCommentRepository extends MongoRepository<ProductComment, String> {
    List<ProductComment> findAllById(String productCommentId);
}
