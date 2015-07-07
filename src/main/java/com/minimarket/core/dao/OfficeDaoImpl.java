package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Office;
import com.minimarket.core.domain.OfficeImpl;

public class OfficeDaoImpl implements OfficeDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Office create() {
		return (Office) entityConfiguration.createEntityInstance(Office.class.getName());
	}

	@Override
	public Office saveOfficce(Office office) {
		return em.merge(office);
	}

	@Override
	public void deleteOffice(Office office) {
		em.remove(office);
	}

	@Override
	public Office readOfficeById(Long officeId) {
		return em.find(OfficeImpl.class, officeId);
	}

	@Override
	public List<Office> readAllOffices() {
		TypedQuery<Office> query = em.createNamedQuery("READ_ALL_OFFICE",Office.class);
		final List<Office> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
