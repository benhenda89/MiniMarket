package com.minimarket.core.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class CustomerImpl extends MiniMarketAbstractUtils implements Customer{
	
	
	  @Id
	  @Column(name="customerNumber" , nullable = false ,length = MAX_ID_LENTH)
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  protected Long 		customerNumber ;
	  
	  @Column(name="customerName" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		customerName;
	  
	  @Column(name="contactLastName" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		contactLastName;
	  
	  @Column(name="contactFirstName" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		contactFirstName;
	  
	  @Column(name="Phone" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		phone;
	  
	  @Column(name="addressLine1" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		addressLine1;
	  
	  @Column(name="addressLine2" , nullable = true ,length = MAX_TEXT_LENTGH)
	  protected String 		addressLine2;
	  
	  @Column(name="city" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		city;
	  
	  @Column(name="state" , nullable = true ,length = MAX_TEXT_LENTGH)
	  protected String 		state;
	  
	  @Column(name="postalCode" , length = MAX_POSTAL_CODE_LENTGH)
	  protected String 		postalCode;
	  
	  @Column(name="country" , nullable = false , length = MAX_TEXT_LENTGH)
	  protected String 		country;
	  
	  @Column(name="salesRepEmployeeNumber" , nullable = true ,length = MAX_ID_LENTH)
	  protected Integer 	salesRepEmployeeNumber;
	  
	  @Column(name="creditLimit")
	  protected BigDecimal 	creditLimit;
	  
	@Override  
	public Long getCustomerNumber() {
		return customerNumber;
	}
	
	@Override 
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@Override 
	public String getCustomerName() {
		return customerName;
	}
	
	@Override 
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Override 
	public String getContactLastName() {
		return contactLastName;
	}
	
	@Override 
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	
	@Override 
	public String getContactFirstName() {
		return contactFirstName;
	}
	
	@Override 
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}
	
	@Override 
	public String getPhone() {
		return phone;
	}
	
	@Override 
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override 
	public String getAddressLine1() {
		return addressLine1;
	}
	
	@Override 
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	@Override 
	public String getAddressLine2() {
		return addressLine2;
	}
	
	@Override 
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	@Override 
	public String getCity() {
		return city;
	}
	
	@Override 
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override 
	public String getState() {
		return state;
	}
	
	@Override 
	public void setState(String state) {
		this.state = state;
	}
	
	@Override 
	public String getPostalCode() {
		return postalCode;
	}
	
	@Override 
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override 
	public String getCountry() {
		return country;
	}
	
	@Override 
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override 
	public Integer getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	
	@Override 
	public void setSalesRepEmployeeNumber(Integer salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}
	
	@Override 
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	
	@Override 
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}
}
