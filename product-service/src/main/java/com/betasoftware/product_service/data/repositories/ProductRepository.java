package com.betasoftware.product_service.data.repositories;

import com.betasoftware.product_service.data.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
