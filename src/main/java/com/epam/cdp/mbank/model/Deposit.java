package com.epam.cdp.mbank.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.epam.cdp.mbank.model.enums.DepositType;

@Entity
@Table(name = "DEPOSITES")
@NamedQueries(value={
@NamedQuery(name = "Deposites.findAll", query = "SELECT dep FROM Deposit dep"),
@NamedQuery(name = "Deposites.getByClientId", query = "SELECT dep FROM Deposit dep WHERE dep.client = :client ")
})
public class Deposit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPOSIT_ID")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private DepositType type;

    @Column(name = "OPENING_DATE")
    private Calendar openingDate;

    @Column(name = "CLOSING_DATE")
    private Calendar closingDate;

    public Deposit() {

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

    public DepositType getType() {
	return type;
    }

    public void setType(DepositType type) {
	this.type = type;
    }

    public Calendar getOpeningDate() {
	return openingDate;
    }

    public void setOpeningDate(Calendar openingDate) {
	this.openingDate = openingDate;
    }

    public Calendar getClosingDate() {
	return closingDate;
    }

    public void setClosingDate(Calendar closingDate) {
	this.closingDate = closingDate;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

}
