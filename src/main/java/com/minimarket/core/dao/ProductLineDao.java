package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.ProductLine;

public interface ProductLineDao {
	
	public ProductLine create();
	
	public ProductLine saveProductLine(ProductLine productLine);
	
	public void deleteProductLine(ProductLine productLine);
	
	public ProductLine readProductLineById(Long productLineId);
	
	public List<ProductLine> getAllProductLines();
}
