package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Customer;

public interface CustomerDao {
	
	/**
	 * Create Instance of {@link Customer}.
	 * @return
	 */
	public Customer create();
	/**
	 * save {@link Customer}.
	 * @param customer
	 * @return
	 */
	public Customer saveCustomer(Customer customer);
	/**
	 * delete {@link Customer}.
	 * @param customer
	 */
	public void deleteCustomer(Customer customer);
	/**
	 * read {@link Customer} bu ID.
	 * @param customerID
	 * @return
	 */
	public Customer readCustomerById(Long customerID);
	/**
	 * read {@link Customer} by E-mail.
	 * @param email
	 * @return
	 */
	public Customer readCustomerByEmail(String email);
	/**
	 * read All Customer.
	 * @return
	 */
	public List<Customer> readAllCustomer();
	/**
	 * read Customers By specified Work.
	 * @param work
	 * @return
	 */
	public List<Customer> readCustomerByWork(String work);
}
