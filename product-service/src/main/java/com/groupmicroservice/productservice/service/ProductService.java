package com.groupmicroservice.productservice.service;

import com.groupmicroservice.productservice.dto.ProductRequest;
import com.groupmicroservice.productservice.dto.ProductResponse;
import com.groupmicroservice.productservice.model.Product;
import com.groupmicroservice.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
@Autowired
    private final ProductRepository productRepository;

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
    public void createProduct(ProductRequest productRequest){
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
//                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("product {} is saved ",product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

     return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
//                .price(product.getPrice())
                .build();
    }
}
