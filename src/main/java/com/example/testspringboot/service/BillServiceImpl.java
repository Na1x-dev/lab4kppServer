package com.example.testspringboot.service;

import com.example.testspringboot.model.Bill;
import com.example.testspringboot.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public void create(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public List<Bill> readAll() {
        return billRepository.findAll();
    }

    @Override
    public Bill read(int id) {
        return billRepository.getById(id);
    }

    @Override
    public Bill readByUsername(String username) {return  billRepository.findByUsername(username);}

    @Override
    public boolean updateById(Bill bill, int id) {
        if (billRepository.existsById(id)) {
            bill.setId(id);
            billRepository.save(bill);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByUsername(Bill bill, String username) {
        if (billRepository.existsByUsername(username)) {
            billRepository.save(bill);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (billRepository.existsById(id)) {
            billRepository.deleteById(id);
            return true;
        }
        return false;
    }


}