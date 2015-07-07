package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Product;

public interface ProductDao {
	
	public Product create();
	
	public Product saveProduct(Product product);
	
	public void deleteProduct(Product product);
	
	public Product readProductById(Long productId);
	
	public List<Product> getAllProduct();
}
