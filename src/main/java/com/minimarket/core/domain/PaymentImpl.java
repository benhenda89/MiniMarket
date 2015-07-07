package com.minimarket.core.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentImpl extends MiniMarketAbstractUtils implements Payment{
	
	
	private 	Customer 		customerNumber;
	
	private 	String  		checkNumber;
	
	private 	Date  			paymentDate;
	
	private 	BigDecimal  	amount;
	
	@Override
	public Customer getCustomerNumber() {
		return customerNumber;
	}
	
	@Override
	public void setCustomerNumber(Customer customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@Override
	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	@Override
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	@Override
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
