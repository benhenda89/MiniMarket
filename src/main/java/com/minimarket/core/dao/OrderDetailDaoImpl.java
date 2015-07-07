package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.OrderDetail;
import com.minimarket.core.domain.OrderDetailImpl;

public class OrderDetailDaoImpl implements OrderDetailDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public OrderDetail create() {
		return (OrderDetail) entityConfiguration.createEntityInstance(OrderDetail.class.getName());
	}

	@Override
	public OrderDetail saveOrderDetail(OrderDetail orderDetail) {
		return em.merge(orderDetail);
	}

	@Override
	public void deleteOrderDetail(OrderDetail orderDetail) {
		em.remove(orderDetail);
	}

	@Override
	public OrderDetail readOrderDetail(Long orderDetailId) {
		return em.find(OrderDetailImpl.class, orderDetailId);
	}

	@Override
	public List<OrderDetail> getAllOrderDetail() {
		TypedQuery<OrderDetail> query = em.createNamedQuery("READ_ALL_ORDER_DETAIL", OrderDetail.class);
		final List<OrderDetail> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
