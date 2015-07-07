package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.ProductLine;
import com.minimarket.core.domain.ProductLineImpl;

public class ProductLineDaoImpl implements ProductLineDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public ProductLine create() {
		return (ProductLine) entityConfiguration.createEntityInstance(ProductLine.class.getName());
	}

	@Override
	public ProductLine saveProductLine(ProductLine productLine) {
		return em.merge(productLine);
	}

	@Override
	public void deleteProductLine(ProductLine productLine) {
		em.remove(productLine);
	}

	@Override
	public ProductLine readProductLineById(Long productLineId) {
		return em.find(ProductLineImpl.class, productLineId);
	}

	@Override
	public List<ProductLine> getAllProductLines() {
		TypedQuery<ProductLine> query = em.createNamedQuery("READ_ALL_ADRESS" , ProductLine.class);
		final List<ProductLine> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
