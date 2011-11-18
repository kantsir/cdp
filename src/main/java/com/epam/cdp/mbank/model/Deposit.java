package com.epam.cdp.mbank.model;

import java.util.Date;

import com.epam.cdp.mbank.model.enums.DepositType;

public class Deposit {
	private Long deposit_id;
	private String client_id;
	private Double balance;
	private DepositType type;
	private Date opening_date;
	private Date closing_date;

	public Deposit() {
		super();
	}

	public Deposit(Long deposit_id, String client_id, Double balance,
			DepositType type, Date opening_date, Date closing_date) {
		super();
		this.deposit_id = deposit_id;
		this.client_id = client_id;
		this.balance = balance;
		this.type = type;
		this.opening_date = opening_date;
		this.closing_date = closing_date;
	}

	public Long getDeposit_id() {
		return deposit_id;
	}

	public void setDeposit_id(Long deposit_id) {
		this.deposit_id = deposit_id;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
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

	public Date getOpening_date() {
		return opening_date;
	}

	public void setOpening_date(Date opening_date) {
		this.opening_date = opening_date;
	}

	public Date getClosing_date() {
		return closing_date;
	}

	public void setClosing_date(Date closing_date) {
		this.closing_date = closing_date;
	}

}
