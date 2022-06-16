package com.hazelcast.cache.controller;

import com.hazelcast.cache.entities.Product;
import com.hazelcast.cache.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product/api")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/getProductById/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

}
