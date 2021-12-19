package com.example.testspringboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bills")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bill {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "iban")
    private String iban;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_validity")
    private String cardValidity;

    @Column(name = "balance")
    private double balance;

    @Column(name = "is_auto_block")
    private boolean isAutoBlock;

    @Column(name = "is_manual_block")
    private boolean isManualBlock;

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getIban() {
        return iban;
    }

    public String getCardName() {
        return cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardValidity() {
        return cardValidity;
    }

    public double getBalance() {return balance;}

    public boolean getIsAutoBlock() {
        return isAutoBlock;
    }

    public boolean getIsManualBlock() {
        return isManualBlock;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardValidity(String cardValidity) {
        this.cardValidity = cardValidity;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAutoBlock(boolean autoBlock) {
        isAutoBlock = autoBlock;
    }

    public void setManualBlock(boolean manualBlock) {
        isManualBlock = manualBlock;
    }
}
