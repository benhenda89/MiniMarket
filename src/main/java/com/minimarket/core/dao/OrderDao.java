package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Order;

public interface OrderDao {
	
	public Order create();
	
	public Order saveOrder(Order order);
	
	public void deleteOrder(Order order);
	
	public Order readOrderById(Long orderId);
	
	public List<Order> readAllOrder();
}
