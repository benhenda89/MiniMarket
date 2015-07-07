package com.minimarket.core.domain;

import java.math.BigDecimal;


public interface Customer {

	Long getCustomerNumber();

	void setCustomerNumber(Long customerNumber);

	String getCustomerName();

	void setCustomerName(String customerName);

	String getContactLastName();

	void setContactLastName(String contactLastName);

	String getContactFirstName();

	void setContactFirstName(String contactFirstName);

	String getPhone();

	void setPhone(String phone);

	String getAddressLine1();

	void setAddressLine1(String addressLine1);

	String getAddressLine2();

	void setAddressLine2(String addressLine2);

	String getCity();

	void setCity(String city);

	String getState();

	void setState(String state);

	String getPostalCode();

	void setPostalCode(String postalCode);

	String getCountry();

	void setCountry(String country);

	Integer getSalesRepEmployeeNumber();

	void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber);

	BigDecimal getCreditLimit();

	void setCreditLimit(BigDecimal creditLimit);

	
}
