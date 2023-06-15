package com.example.TransactionService.model;


import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document
public class Transaction {

  @Id
  private Long id;
  private CompanyLedgerMaster company;
  private BranchMaster branch;
  private DepartmentMaster department;
  private String transactionNumber;
  private TransactionStatus transactionStatus;
  private String remarks;
  private List<Long> lineItems;


}
