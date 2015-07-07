package com.minimarket.core.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERDETAILS")
public class OrderDetailImpl extends MiniMarketAbstractUtils implements OrderDetail{
	
	@Id
	@Column(name = "orderNumber" , nullable = false , length = MAX_ID_LENTH)
	private Long orderNumber;
	
	@OneToMany(targetEntity = ProductImpl.class , cascade = {CascadeType.ALL} , orphanRemoval = false)
	private List<Product> products;
	
	@Column(name="quantityOrdered" ,nullable=false)
	private Integer quantityOrdered;
	
	@Column(name="priceEach")
	private BigDecimal priceEach;
	
	@Column(name="orderLineNumber")
	private Integer orderLineNumber;
	
	@Override
	public Long getOrderNumber() {
		return orderNumber;
	}
	
	@Override
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	@Override
	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}
	
	@Override
	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	
	@Override
	public BigDecimal getPriceEach() {
		return priceEach;
	}
	
	@Override
	public void setPriceEach(BigDecimal priceEach) {
		this.priceEach = priceEach;
	}
	
	@Override
	public Integer getOrderLineNumber() {
		return orderLineNumber;
	}
	
	@Override
	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public void setProducts(List<Product> product) {
		// TODO Auto-generated method stub
		this.products = product;
	}
	
	
}
