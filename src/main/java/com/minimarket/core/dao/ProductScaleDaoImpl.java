package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.ProductScale;
import com.minimarket.core.domain.ProductScaleImpl;

public class ProductScaleDaoImpl implements ProductScaleDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public ProductScale create() {
		return (ProductScale) entityConfiguration.createEntityInstance(ProductScale.class.getName());
	}

	@Override
	public ProductScale saveProductScale(ProductScale productScale) {
		return em.merge(productScale);
	}

	@Override
	public void deleteProductScale(ProductScale productScale) {
		em.remove(productScale);
	}

	@Override
	public ProductScale readProductScaleById(Long productScaleId) {
		return em.find(ProductScaleImpl.class, productScaleId);
	}

	@Override
	public List<ProductScale> getAllProductScales() {
		TypedQuery<ProductScale> query = em.createNamedQuery("READ_ALL_PRODUCT_SCALE", ProductScale.class);
		final List<ProductScale> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
