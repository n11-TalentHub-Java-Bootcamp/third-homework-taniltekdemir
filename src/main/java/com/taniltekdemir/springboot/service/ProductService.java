package com.taniltekdemir.springboot.service;

import com.taniltekdemir.springboot.dto.ProductDetailDto;
import com.taniltekdemir.springboot.entitiy.Product;
import com.taniltekdemir.springboot.mapper.ProductMapper;
import com.taniltekdemir.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(String id){

        Optional<Product> optional = productRepository.findById(id);

        Product product = null;
        if (optional.isPresent()){
            product = optional.get();
        }

        return product;
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void delete(String id){
        productRepository.deleteById(id);
    }

    public List<ProductDetailDto> findAllProductByCategoryId(String categoryId) {
        List<Product> productList = productRepository.findAllProductByCategoryId(categoryId);

        List<ProductDetailDto> productDetailDtoList = ProductMapper.INSTANCE.convertAllProductListToProductDetailDtoList(productList);

        return productDetailDtoList;
    }

    public void deleteById(String id) {
        productRepository.deleteById(id);
    }

    public ProductDetailDto findProductDetailDtoById(String id) {
        Product product = findById(id);

        ProductDetailDto productDetailDto = ProductMapper.INSTANCE.convertProductToProductDetailDto(product);

        return productDetailDto;
    }
}
