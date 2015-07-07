package com.minimarket.core.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")

public class OrderImpl extends MiniMarketAbstractUtils implements Order{
	
	@Id
	@Column(name="ORDERNUMBER" , nullable = false , length = MAX_ID_LENTH)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderNumber;
	
	
	private String productCode;
	private Integer quantityOrdered;
	private BigDecimal priceEach;
	private Long orderLineNumber;
	
	@OneToOne(targetEntity  = OrderDetailImpl.class , cascade = CascadeType.ALL)
	@JoinColumn(name = "orderNumber")
	private OrderDetail orderDetail;
	
	public Long getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public BigDecimal getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(BigDecimal priceEach) {
		this.priceEach = priceEach;
	}
	public Long getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(Long orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
	
}
