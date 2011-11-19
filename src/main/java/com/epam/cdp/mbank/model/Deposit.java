package com.epam.cdp.mbank.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.epam.cdp.mbank.model.enums.DepositType;

@Entity
@Table(name = "DEPOSITES")
public class Deposit implements Serializable{

	private static final long serialVersionUID = 3197140410428783216L;

	@Id
	@Column(name = "DEPOSIT_ID")
	private Long id;

	@Column(name = "CLIENT_ID")
	private String clientId;

	@Column(name = "BALANCE")
	private Double balance;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private DepositType type;

	@Column(name = "OPENING_DATE")
	private Date openingDate;

	@Column(name = "CLOSING_DATE")
	private Date closingDate;

	public Deposit() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
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

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

}
