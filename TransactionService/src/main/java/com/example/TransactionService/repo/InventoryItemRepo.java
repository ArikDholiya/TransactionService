package com.example.TransactionService.repo;

import com.example.TransactionService.model.InventoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryItemRepo extends MongoRepository<InventoryItem, Long> {

}
