package com.caseStudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.caseStudy.model.Cart;
@Repository
public interface CartRepository extends MongoRepository<Cart, Integer>{
	
	public Cart findByCartId(int id);
	
	

}
