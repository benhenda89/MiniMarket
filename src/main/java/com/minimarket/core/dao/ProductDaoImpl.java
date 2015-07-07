package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Product;
import com.minimarket.core.domain.ProductImpl;

public class ProductDaoImpl implements ProductDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Product create() {
		return (Product) entityConfiguration.createEntityInstance(Product.class.getName());
	}

	@Override
	public Product saveProduct(Product product) {
		return em.merge(product);
	}

	@Override
	public void deleteProduct(Product product) {
		em.remove(product);
	}

	@Override
	public Product readProductById(Long productId) {
		return em.find(ProductImpl.class, productId);
	}

	@Override
	public List<Product> getAllProduct() {
		TypedQuery<Product> query = em.createNamedQuery("READ_ALL_ORDER_DETAIL", Product.class);
		final List<Product> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}
	
}
