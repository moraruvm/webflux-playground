package com.github.moraruvm.webfluxtest.repository;

import com.github.moraruvm.webfluxtest.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> { }
