package com.example.TransactionService.service;

import com.example.TransactionService.model.person;
import com.example.TransactionService.repo.personrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personservice {

    @Autowired
    public personrepo personrepo1;

    public person saveperson(person person)
    {
        return personrepo1.save(person);
    }
}
