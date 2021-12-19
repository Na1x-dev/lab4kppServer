package com.example.testspringboot.service;


import com.example.testspringboot.model.Bill;
import java.util.List;

public interface BillService {

    void create(Bill bill);

    List<Bill> readAll();

    Bill read(int id);

    Bill readByUsername(String username);

    boolean updateById(Bill bill, int id);

    boolean updateByUsername(Bill bill, String username);

    boolean delete(int id);
}
