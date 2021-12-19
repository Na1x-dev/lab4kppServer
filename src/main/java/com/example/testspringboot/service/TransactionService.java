package com.example.testspringboot.service;

import com.example.testspringboot.model.Transaction;

import java.util.List;

public interface TransactionService {

    void create(Transaction transaction);

    List<Transaction> readAll();

    Transaction read(int id);

    List<Transaction> readByUsername(String username);

    boolean updateByUsername(Transaction transaction, String username);

    boolean delete(int id);
}