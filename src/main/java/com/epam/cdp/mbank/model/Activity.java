package com.epam.cdp.mbank.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ACTIVITIES")
@NamedQueries(value= {
		@NamedQuery(name = "Activities.findAll", query = "SELECT act FROM Activity act"),
		@NamedQuery(name = "Activities.getByClientId", query = "SELECT act FROM Activity act WHERE act.client = :client ")
})
public class Activity implements Serializable {

    private static final long serialVersionUID = -7945665348252323705L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "ACTIVITY_DATE")
    private Calendar activityDate;

    @Column(name = "COMMISION")
    private Double commision;

    @Column(name = "DESCRIPTION")
    private String description;

    public Activity() {
    }

    public Long getId() {
	return id;
    }

    public Double getAmount() {
	return amount;
    }

    public void setAmount(Double amount) {
	this.amount = amount;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Client getClient() {
	return client;
    }

    public void setClient(Client client) {
	this.client = client;
    }

    public Calendar getActivityDate() {
	return activityDate;
    }

    public void setActivityDate(Calendar activityDate) {
	this.activityDate = activityDate;
    }

    public Double getCommision() {
	return commision;
    }

    public void setCommision(Double commision) {
	this.commision = commision;
    }

}
