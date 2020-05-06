package com.market.marketplace.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.market.marketplace.models.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
