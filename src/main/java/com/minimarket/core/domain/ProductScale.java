package com.minimarket.core.domain;

import java.math.BigDecimal;

public interface ProductScale {
	
	public Long getId();
	
	public void setId(Long id);
	
	public BigDecimal getWidth();
	
	public void setWidth(BigDecimal width);
	
	public BigDecimal getHeight();
	
	public void setHeigth(BigDecimal heigth);
	
	public BigDecimal getWeight();
	
	public void setWeight(BigDecimal weight);
	
	public Product getProduct();
	
	public void setProduct(Product product);
}
