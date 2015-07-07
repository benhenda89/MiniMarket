package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Vendor;
import com.minimarket.core.domain.VendorImpl;

public class VendorDaoImpl implements VendorDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Vendor create() {
		return (Vendor) entityConfiguration.createEntityInstance(Vendor.class.getName());
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return em.merge(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		em.remove(vendor);
	}

	@Override
	public Vendor readVendorById(Long vendorId) {
		return em.find(VendorImpl.class, vendorId);
	}

	@Override
	public List<Vendor> getAllVendors() {
		TypedQuery<Vendor> query = em.createNamedQuery("READ_ALL_ORDER_DETAIL", Vendor.class);
		final List<Vendor> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
