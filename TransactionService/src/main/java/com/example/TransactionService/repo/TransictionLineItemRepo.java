package com.example.TransactionService.repo;

import com.example.TransactionService.model.TransactionLineItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransictionLineItemRepo extends MongoRepository<TransactionLineItem, Long> {

}
