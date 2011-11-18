package com.epam.cdp.mbank.model;

public class Account {
	private Long account_id;
	private Long client_id;
	private Double balance;
	private Double credit_limit;
	private String comment;

	public Account() {
		super();
	}

	public Account(Long account_id, Long client_id, Double balance,
			Double credit_limit, String comment) {
		super();
		this.account_id = account_id;
		this.client_id = client_id;
		this.balance = balance;
		this.credit_limit = credit_limit;
		this.comment = comment;
	}

	public Long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getCredit_limit() {
		return credit_limit;
	}

	public void setCredit_limit(Double credit_limit) {
		this.credit_limit = credit_limit;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
