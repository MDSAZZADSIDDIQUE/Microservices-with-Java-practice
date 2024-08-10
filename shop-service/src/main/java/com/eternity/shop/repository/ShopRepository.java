package com.eternity.shop.repository;

import com.eternity.shop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopRepository extends MongoRepository<Product, String> {
}
