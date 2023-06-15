package com.example.TransactionService.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllItemResponse {

  private List<TransactionLineItemResponse> transactionLineItemResponseList;
}
