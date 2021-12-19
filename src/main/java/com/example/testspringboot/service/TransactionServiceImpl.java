package com.example.testspringboot.service;

import com.example.testspringboot.model.Transaction;
import com.example.testspringboot.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void create(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> readAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction read(int id) {
        return transactionRepository.getById(id);
    }

    @Override
    public List<Transaction> readByUsername(String username) {return  transactionRepository.findByUsername(username);}

    @Override
    public boolean updateByUsername(Transaction transaction, String username) {
        if (transactionRepository.findOneByUsername(username)) {
            transactionRepository.save(transaction);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (transactionRepository.existsById(id)) {
            transactionRepository.deleteById(id);
            return true;
        }
        return false;
    }


}