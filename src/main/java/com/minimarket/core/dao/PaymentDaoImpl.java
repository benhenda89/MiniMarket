package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Payment;
import com.minimarket.core.domain.PaymentImpl;

public class PaymentDaoImpl implements PaymentDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Payment getPaymentById(Long paymentId) {
		return em.find(PaymentImpl.class, paymentId);
	}

	@Override
	public Payment create() {
		return (Payment) entityConfiguration.createEntityInstance(Payment.class.getName());
	}

	@Override
	public Payment savePayment(Payment payment) {
		return em.merge(payment);
	}

	@Override
	public void deletePayment(Payment payment) {
		em.remove(payment);
		
	}

	@Override
	public List<Payment> getAllPayments() {
		TypedQuery<Payment> query = em.createNamedQuery("READ_ALL_ORDER_DETAIL", Payment.class);
		final List<Payment> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
