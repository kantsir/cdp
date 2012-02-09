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
@NamedQuery(name = "Deposites.getByClientId", query = "SELECT dep FROM Deposit dep WHERE dep.client.id = :clientId ")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result
				+ ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((openingDate == null) ? 0 : openingDate.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deposit other = (Deposit) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (closingDate == null) {
			if (other.closingDate != null)
				return false;
		} else if (!closingDate.equals(other.closingDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (openingDate == null) {
			if (other.openingDate != null)
				return false;
		} else if (!openingDate.equals(other.openingDate))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
