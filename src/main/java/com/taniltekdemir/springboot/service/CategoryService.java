package com.taniltekdemir.springboot.service;

import com.taniltekdemir.springboot.entitiy.Category;
import com.taniltekdemir.springboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(String id) {
        Optional<Category> optional = categoryRepository.findById(id);

        Category category = null;
        if (optional.isPresent()) {
            category = optional.get();
        }

        return category;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(String id) {
        categoryRepository.deleteById(id);
    }
}
