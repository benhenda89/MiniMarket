package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.ProductScale;

public interface ProductScaleDao {
	
	public ProductScale create();
	
	public ProductScale saveProductScale(ProductScale productScale);
	
	public void deleteProductScale(ProductScale productScale);
	
	public ProductScale readProductScaleById(Long productScaleId);
	
	public List<ProductScale> getAllProductScales();
}
