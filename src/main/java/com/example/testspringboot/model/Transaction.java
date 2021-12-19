package com.example.testspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "name_of_transaction")
    private String nameOfTransaction;

    @Column(name = "check_number")
    private String checkNumber;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "card_number")
    private String cardNumber;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNameOfTransaction() {
        return nameOfTransaction;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNameOfTransaction(String nameOfTransaction) {
        this.nameOfTransaction = nameOfTransaction;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
