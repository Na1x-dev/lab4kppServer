package com.example.testspringboot.repository;

import com.example.testspringboot.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer> {

    Bill findByUsername(String username);

    boolean existsByUsername(String username);
}
