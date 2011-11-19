package com.epam.cdp.mbank.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.epam.cdp.mbank.model.enums.ClientType;

@Entity
@Table(name = "CLIENTS")
public class Client implements Serializable {

	private static final long serialVersionUID = 7417311628652888910L;

	@Id
	@GeneratedValue
	@Column(name = "CLIENT_ID")
	private Long id;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private ClientType type;

	@Column(name = "CLIENT_NAME")
	private String client_name;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ADRESS")
	private String address;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "COMMENT")
	private String comment;

	public Client() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientType getType() {
		return type;
	}

	public void setType(ClientType type) {
		this.type = type;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
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
	

}
