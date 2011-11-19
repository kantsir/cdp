package com.epam.cdp.mbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Account {
	@Id
	@GeneratedValue
    @Column
	private Long account_id;
	
    @Column
    private Long client_id;
	
	@Column
    private Double balance;
	
    @Column
    private Double credit_limit;
	
    @Column
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
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((account_id == null) ? 0 : account_id.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result
				+ ((client_id == null) ? 0 : client_id.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result
				+ ((credit_limit == null) ? 0 : credit_limit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if (account_id == null) {
			if (other.account_id != null) {
				return false;
			}
		} else if (!account_id.equals(other.account_id)) {
			return false;
		}
		if (balance == null) {
			if (other.balance != null) {
				return false;
			}
		} else if (!balance.equals(other.balance)) {
			return false;
		}
		if (client_id == null) {
			if (other.client_id != null) {
				return false;
			}
		} else if (!client_id.equals(other.client_id)) {
			return false;
		}
		if (comment == null) {
			if (other.comment != null) {
				return false;
			}
		} else if (!comment.equals(other.comment)) {
			return false;
		}
		if (credit_limit == null) {
			if (other.credit_limit != null) {
				return false;
			}
		} else if (!credit_limit.equals(other.credit_limit)) {
			return false;
		}
		return true;
	}
}
