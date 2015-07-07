package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Order;
import com.minimarket.core.domain.OrderImpl;

public class OrderDaoImpl implements OrderDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Order create() {
		return (Order) entityConfiguration.createEntityInstance(Order.class.getName());
	}

	@Override
	public Order saveOrder(Order order) {
		return em.merge(order);
	}

	@Override
	public void deleteOrder(Order order) {
		em.remove(order);
	}

	@Override
	public Order readOrderById(Long orderId) {
		return em.find(OrderImpl.class, orderId);
	}

	@Override
	public List<Order> readAllOrder() {
		TypedQuery<Order> query = em.createNamedQuery("READ_ALL_ORDER",Order.class);
		final List<Order> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
