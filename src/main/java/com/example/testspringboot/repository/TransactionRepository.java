package com.example.testspringboot.repository;

import com.example.testspringboot.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findByUsername(String username);

    boolean findOneByUsername(String username);
}
