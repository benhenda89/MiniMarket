package com.minimarket.core.domain;

import java.math.BigDecimal;
import java.util.Date;

public interface Payment {

	Customer getCustomerNumber();

	void setCustomerNumber(Customer customerNumber);

	String getCheckNumber();

	Date getPaymentDate();

	void setPaymentDate(Date paymentDate);

	BigDecimal getAmount();

	void setAmount(BigDecimal amount);

}
