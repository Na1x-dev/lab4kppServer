package com.example.testspringboot.controllers;


import com.example.testspringboot.model.Bill;
import com.example.testspringboot.service.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping(value = "/bills")
    public ResponseEntity<?> create(@RequestBody Bill bill) {
        final Bill chekBill = billService.readByUsername(bill.getUsername());
        if (chekBill == null) {
            billService.create(bill);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(chekBill, HttpStatus.FOUND);
    }

    @GetMapping(value = "/bills")
    public ResponseEntity<List<Bill>> read() {
        final List<Bill> bills = billService.readAll();
        return bills != null && !bills.isEmpty()
                ? new ResponseEntity<>(bills, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/bills/byId/{id}")
    public ResponseEntity<Bill> read(@PathVariable(name = "id") int id) {
        final Bill bill = billService.read(id);
        return bill != null
                ? new ResponseEntity<>(bill, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/bills/byUsername/{Username}")
    public ResponseEntity<Bill> readByUsername(@PathVariable(name = "Username") String billname) {
        final Bill bill = billService.readByUsername(billname);
        return bill != null
                ? new ResponseEntity<>(bill, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/bills/byId/{id}")
    public ResponseEntity<?> updateById(@PathVariable(name = "id") int id, @RequestBody Bill bill) {
        final boolean updated = billService.updateById(bill, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @PutMapping(value = "/bills/byUsername/{username}")
    public ResponseEntity<?> updateByUsername(@PathVariable(name = "username") String username, @RequestBody Bill bill) {
        final boolean updated = billService.updateByUsername(bill, username);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/bills/byId/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = billService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}