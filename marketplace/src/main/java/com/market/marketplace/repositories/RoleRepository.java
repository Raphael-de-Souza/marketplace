package com.market.marketplace.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.market.marketplace.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);	
}
