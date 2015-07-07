package com.minimarket.core.domain;

import java.math.BigDecimal;
import java.util.List;

public interface OrderDetail {

	void setOrderNumber(Long orderNumber);

	Long getOrderNumber();

	List<Product> getProducts();

	void setProducts(List<Product> product);

	Integer getQuantityOrdered();

	void setQuantityOrdered(Integer quantityOrdered);

	BigDecimal getPriceEach();

	void setPriceEach(BigDecimal priceEach);

	Integer getOrderLineNumber();

	void setOrderLineNumber(Integer orderLineNumber);

}
