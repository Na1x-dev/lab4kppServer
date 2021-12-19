package com.example.testspringboot.controllers;


import com.example.testspringboot.model.Transaction;
import com.example.testspringboot.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(value = "/transactions")
    public ResponseEntity<?> create(@RequestBody Transaction transaction) {
            transactionService.create(transaction);
            return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }

    @GetMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> read() {
        final List<Transaction> transactions = transactionService.readAll();
        return transactions != null && !transactions.isEmpty()
                ? new ResponseEntity<>(transactions, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/transactions/byId/{id}")
    public ResponseEntity<Transaction> read(@PathVariable(name = "id") int id) {
        final Transaction transaction = transactionService.read(id);
        return transaction != null
                ? new ResponseEntity<>(transaction, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/transactions/byUsername/{Username}")
    public ResponseEntity<List<Transaction>> readByUsername(@PathVariable(name = "Username") String username) {
        final List<Transaction> transactions = transactionService.readByUsername(username);
        return transactions != null && !transactions.isEmpty()
                ? new ResponseEntity<>(transactions, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/transactions/byUsername/{username}")
    public ResponseEntity<?> updateByUsername(@PathVariable(name = "username") String username, @RequestBody Transaction transaction) {
        final boolean updated = transactionService.updateByUsername(transaction, username);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/transactions/byId/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = transactionService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}