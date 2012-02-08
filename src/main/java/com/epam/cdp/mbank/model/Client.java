package com.epam.cdp.mbank.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.epam.cdp.mbank.model.enums.ClientActiveState;
import com.epam.cdp.mbank.model.enums.ClientType;

@Entity
@Table(name = "CLIENTS")
@NamedQueries(value= {
		@NamedQuery(name = "Clients.getAll", query = "SELECT c FROM Client c"),
		@NamedQuery(name = "Clients.getByName", query = "SELECT c FROM Client c WHERE c.clientName = :clientName"),
		@NamedQuery(name = "Clients.getByEmail", query = "SELECT c FROM Client c WHERE c.email = :email"),
		@NamedQuery(name = "Clients.getByPhone", query = "SELECT c FROM Client c WHERE c.phone = :phone"),
		@NamedQuery(name = "Clients.getByAddress", query = "SELECT c FROM Client c WHERE c.address = :address"),
		@NamedQuery(name = "Clients.getByActiveState", query = "SELECT c FROM Client c WHERE c.clientActiveState = :clientActiveState")
		
})
public class Client implements Serializable {

    private static final long serialVersionUID = 7417311628652888910L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private ClientType type;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "COMMENT")
    private String comment;
    
    @Column(name ="CLIENTACTIVESTATE")
    @Enumerated(EnumType.STRING)
    private ClientActiveState clientActiveState;
    

    @OneToOne(cascade = CascadeType.ALL, mappedBy="client")
    private Account account;

   
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private List<Deposit> deposites;

   
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private List<Activity> activities;

        
    public Client() {
    }

    public Long getId() {
	return id;
    }

    public ClientType getType() {
	return type;
    }

    public void setType(ClientType type) {
	this.type = type;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public List<Activity> getActivities() {
	return activities;
    }

    public void setActivities(List<Activity> activities) {
	this.activities = activities;
    }

    public List<Deposit> getDeposites() {
	return deposites;
    }

    public void setDeposites(List<Deposit> deposites) {
	this.deposites = deposites;
    }

    public Account getAccount() {
	return account;
    }

    public void setAccount(Account account) {
	this.account = account;
	account.setClient(this);
    }

    public String getClientName() {
	return clientName;
    }

    public void setClientName(String clientName) {
	this.clientName = clientName;
    }

	public ClientActiveState getClientActiveState() {
		return clientActiveState;
	}

	public void setClientActiveState(ClientActiveState clientActiveState) {
		this.clientActiveState = clientActiveState;
	}

}
