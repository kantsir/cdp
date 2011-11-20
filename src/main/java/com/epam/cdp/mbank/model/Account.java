package com.epam.cdp.mbank.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "CREDIT_LIMIT")
    private Double creditLimit;

    @Column(name = "COMMENT")
    private String comment;

    public Account() {
    }

    public Long getId() {
	return id;
    }

    public Double getBalance() {
	return balance;
    }

    public void setBalance(Double balance) {
	this.balance = balance;
    }

    public Double getCreditLimit() {
	return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
	this.creditLimit = creditLimit;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    // public Long getClientId() {
    // return clientId;
    // }
    //
    // public void setClientId(Long clientId) {
    // this.clientId = clientId;
    // }

}
