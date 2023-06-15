package com.example.TransactionService.Controller;

import com.example.TransactionService.dto.AllItemResponse;
import com.example.TransactionService.dto.InventoryItemRequest;
import com.example.TransactionService.dto.TransactionLineItemRequest;
import com.example.TransactionService.dto.TransactionRequest;
import com.example.TransactionService.model.InventoryItem;
import com.example.TransactionService.model.Transaction;
import com.example.TransactionService.model.TransactionLineItem;
import com.example.TransactionService.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

  @Autowired
  private TransactionService transactionService;

  @PostMapping
  public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionRequest request) {
    return new ResponseEntity<>(transactionService.createTransaction(request), HttpStatus.CREATED);
  }


  @PostMapping("/{transactionId}/line-items")
  public ResponseEntity<TransactionLineItem> addLineItem(@PathVariable Long transactionId,
                                                         @RequestBody TransactionLineItemRequest lineItem) {
    return new ResponseEntity<>(transactionService.addLineItem(transactionId, lineItem), HttpStatus.CREATED);
  }

  @PostMapping("/line-items/{lineItemId}/inventory-items")
  public ResponseEntity<InventoryItem> addInventoryItem(@PathVariable Long lineItemId,
                                                        @RequestBody InventoryItemRequest request) {
    return new ResponseEntity<>(transactionService.addInventoryItem(lineItemId, request),
        HttpStatus.CREATED);
  }

  @DeleteMapping("/{transactionId}")
  public ResponseEntity<String> deleteTransaction(@PathVariable Long transactionId) {
    transactionService.deleteTransaction(transactionId);
    return new ResponseEntity<>("Transaction deleted", HttpStatus.OK);
  }

  @GetMapping("/{transactionId}")
  public ResponseEntity<AllItemResponse> getAllInventory(@PathVariable Long transactionId) {
    return new ResponseEntity<>(transactionService.getAllInventory(transactionId), HttpStatus.OK);
  }
}
