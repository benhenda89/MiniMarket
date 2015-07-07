package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Payment;

public interface PaymentDao {
	
	public Payment getPaymentById(Long paymentId);
	
	public Payment create();
	
	public Payment savePayment(Payment payment);
	
	public void deletePayment(Payment payment);
	
	public List<Payment> getAllPayments();
}
