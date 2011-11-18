package com.epam.cdp.mbank.model;

import java.sql.Date;

public class Activity {

	private Long id;
	private Long client_id;
	private Double amount;
	private Date activity_date;
	private Double commision;
	private String description;

	public Activity() {
		super();
	}

	public Activity(Long id, Long client_id, Double amount, Date activity_date,
			Double commision, String description) {
		super();
		this.id = id;
		this.client_id = client_id;
		this.amount = amount;
		this.activity_date = activity_date;
		this.commision = commision;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getActivity_date() {
		return activity_date;
	}

	public void setActivity_date(Date activity_date) {
		this.activity_date = activity_date;
	}

	public Double getCommision() {
		return commision;
	}

	public void setCommision(Double commision) {
		this.commision = commision;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
