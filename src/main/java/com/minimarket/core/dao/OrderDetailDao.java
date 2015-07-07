package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.OrderDetail;

public interface OrderDetailDao {
	
	public OrderDetail create();
	
	public OrderDetail saveOrderDetail(OrderDetail orderDetail);
	
	public    void 	   deleteOrderDetail(OrderDetail orderDetail);
	
	public OrderDetail readOrderDetail(Long orderDetailId);
	
	public List<OrderDetail> getAllOrderDetail();
}
