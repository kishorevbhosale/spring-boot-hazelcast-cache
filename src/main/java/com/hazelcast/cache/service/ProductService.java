package com.hazelcast.cache.service;

import com.hazelcast.cache.entities.Product;
import com.hazelcast.cache.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Cacheable(value = "product")
    public List<Product> getAllProducts(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        List<Product> products =  productRepository.findAll();
        log.info("Loading data from DB!!!");
        return products;
    }

    @Cacheable(value = "product")
    public Optional<Product> getProductById(Long id){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Optional<Product> product = productRepository.findById(id);
        log.info("Loading data from DB : "+product);
        return product;
    }

    @CacheEvict(value = "product", allEntries = true)
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    @CacheEvict(value = "product", allEntries = true)
    public Product updateProduct(Long id, Product newProduct){
        Product product = getProductById(id).get();
        product.setPrice(newProduct.getPrice());
        product.setProductName(newProduct.getProductName());
        return productRepository.save(product);
    }
}
