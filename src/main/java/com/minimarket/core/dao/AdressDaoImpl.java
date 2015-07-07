package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;
import org.springframework.stereotype.Repository;

import com.minimarket.core.domain.Adress;
import com.minimarket.core.domain.AdressImpl;

@Repository("adressDao")
public class AdressDaoImpl implements AdressDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Adress create() {
		return (Adress) entityConfiguration.createEntityInstance(Adress.class.getName());
	}

	@Override
	public Adress saveAdress(Adress adress) {
		return em.merge(adress);
	}

	@Override
	public void deleteAdress(Adress adress) {
		em.remove(adress);
		
	}

	@Override
	public Adress readAdressById(Long adressId) {
		return em.find(AdressImpl.class, adressId);
	}

	@Override
	public List<Adress> readAllAdress() {
		TypedQuery<Adress> query = em.createNamedQuery("READ_ALL_ADRESS" , Adress.class);
		final List<Adress> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}
	
	
}
