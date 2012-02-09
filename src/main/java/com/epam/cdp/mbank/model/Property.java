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

	}

	public Property(String propertyKey, String propertyValue) {
		super();
		this.propertyKey = propertyKey;
		this.propertyValue = propertyValue;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((propertyKey == null) ? 0 : propertyKey.hashCode());
		result = prime * result
				+ ((propertyValue == null) ? 0 : propertyValue.hashCode());
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
		Property other = (Property) obj;
		if (propertyKey == null) {
			if (other.propertyKey != null)
				return false;
		} else if (!propertyKey.equals(other.propertyKey))
			return false;
		if (propertyValue == null) {
			if (other.propertyValue != null)
				return false;
		} else if (!propertyValue.equals(other.propertyValue))
			return false;
		return true;
	}
}
