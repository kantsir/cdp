package com.epam.cdp.mbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PROPERTIES")
@NamedQuery(name = "Properties.findAll", query = "SELECT prop FROM Property prop")
public class Property {

    @Id
    @Column(name = "PROP_KEY")
    private String propertyKey;

    @Column(name = "PROP_VALUE")
    private String propertyValue;

    public Property() {
	super();
    }

    public String getPropertyKey() {
	return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
	this.propertyKey = propertyKey;
    }

    public String getPropertyValue() {
	return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
	this.propertyValue = propertyValue;
    }

}
