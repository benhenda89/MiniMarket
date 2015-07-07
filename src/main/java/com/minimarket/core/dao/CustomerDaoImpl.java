package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;
import org.springframework.stereotype.Repository;

import com.minimarket.core.domain.Customer;
import com.minimarket.core.domain.CustomerImpl;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Customer create() {
		return (Customer) entityConfiguration.createEntityInstance(Customer.class.getName());
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return em.merge(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		em.remove(customer);
		
	}

	@Override
	public Customer readCustomerById(Long customerID) {
		return em.find(CustomerImpl.class, customerID);
	}

	@Override
	public Customer readCustomerByEmail(String email) {
		TypedQuery<Customer> query = em.createNamedQuery("READ_CUSTOMER_BY_ID", Customer.class);
		final Customer tmp = query.getSingleResult();
		if(tmp != null){
			return tmp;
		}
		return null;
	}

	@Override
	public List<Customer> readAllCustomer() {
		TypedQuery<Customer> query = em.createNamedQuery("READ_ALL_CUSTOMER", Customer.class);
		final List<Customer> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

	@Override
	public List<Customer> readCustomerByWork(String work) {
		TypedQuery<Customer> query = em.createNamedQuery("READ_CUSTOMER_BY_ID", Customer.class);
		query.setParameter("work", work);
		final List<Customer> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
