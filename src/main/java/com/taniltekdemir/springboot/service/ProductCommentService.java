package com.taniltekdemir.springboot.service;

import com.taniltekdemir.springboot.entitiy.ProductComment;
import com.taniltekdemir.springboot.repository.ProductCommentRepository;
import com.taniltekdemir.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductCommentService {

    @Autowired
    private ProductCommentRepository productCommentRepository;

    public List<ProductComment> findAll() {
        return productCommentRepository.findAll();
    }

    public ProductComment findById(String id) {
        Optional<ProductComment> optional = productCommentRepository.findById(id);

        ProductComment productComment = null;
        if (optional.isPresent()) {
            productComment = optional.get();
        }
        return productComment;
    }

    public ProductComment save (ProductComment productComment) {
        return productCommentRepository.save(productComment);
    }

    public void delete(String id) {
        productCommentRepository.deleteById(id);
    }

}
