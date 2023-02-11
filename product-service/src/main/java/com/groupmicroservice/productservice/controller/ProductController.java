package com.groupmicroservice.productservice.controller;
import com.groupmicroservice.productservice.dto.ProductRequest;
import com.groupmicroservice.productservice.dto.ProductResponse;
import com.groupmicroservice.productservice.model.Product;
import com.groupmicroservice.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    @Autowired
    private final ProductService productService;



    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
       return productService.getAllProducts();
    }


}
