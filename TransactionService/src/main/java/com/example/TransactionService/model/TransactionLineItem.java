package com.example.TransactionService.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class TransactionLineItem {

  @Id
  private Long uniqueId;
  private ArticleMaster article;
  private ColorMaster colour;
  private Date requiredOnDate;
  private double quantity;
  private int ratePerUnit;
  private String unit;
  private Long transactionId;
  private List<Long> inventoryId;
}
