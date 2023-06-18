package com.example.TransactionService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionLineItemRequest {

  private Long transactionLineItemID ;
  private ArticleMasterRequest article;
  private ColorMasterRequest colour;
  private double quantity;
  private int ratePerUnit;
  private String unit;
}
