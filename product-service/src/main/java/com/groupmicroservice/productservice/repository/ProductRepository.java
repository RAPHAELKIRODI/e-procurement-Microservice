package com.groupmicroservice.productservice.repository;

import com.groupmicroservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
