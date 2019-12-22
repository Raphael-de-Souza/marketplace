package com.market.marketplace.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.market.marketplace.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}
