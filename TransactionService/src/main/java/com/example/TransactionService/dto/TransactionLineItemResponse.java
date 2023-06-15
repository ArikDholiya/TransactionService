package com.example.TransactionService.dto;


import com.example.TransactionService.model.InventoryItem;
import com.example.TransactionService.model.TransactionLineItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionLineItemResponse {

  private TransactionLineItem transactionLineItem;
  private List<InventoryItem> inventoryItemList;
}
