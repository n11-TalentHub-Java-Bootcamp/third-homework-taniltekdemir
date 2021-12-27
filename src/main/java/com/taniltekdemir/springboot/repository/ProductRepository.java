package com.taniltekdemir.springboot.repository;

import com.taniltekdemir.springboot.dto.ProductDetailDto;
import com.taniltekdemir.springboot.entitiy.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String > {
    List<Product> findAllByCategoryId(String categoryId);

    ProductDetailDto findProductDetailDtoById(String id);

    List<Product> findAllProductByCategoryId(String categoryId);
}
