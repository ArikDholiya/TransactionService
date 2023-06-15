package com.example.TransactionService.repo;

import com.example.TransactionService.model.person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personrepo extends MongoRepository<person,Integer> {

}
