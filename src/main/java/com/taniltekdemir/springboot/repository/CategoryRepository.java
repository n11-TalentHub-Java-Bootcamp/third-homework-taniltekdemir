package com.taniltekdemir.springboot.repository;

import com.taniltekdemir.springboot.entitiy.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
