package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;
import org.springframework.stereotype.Repository;

import com.minimarket.core.domain.Country;
import com.minimarket.core.domain.CountryImpl;

@Repository("countryDao")
public class CountryDaoImpl implements CountryDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Country create() {
		return (Country) entityConfiguration.createEntityInstance(Country.class.getName());
	}

	@Override
	public Country saveCountry(Country country) {
		return em.merge(country);
	}

	@Override
	public void deleteCountry(Country country) {
		em.remove(country);
		
	}

	@Override
	public Country readCountryById(Long countryId) {
		return em.find(CountryImpl.class, countryId);
	}

	@Override
	public List<Country> readAllCountry() {
		TypedQuery<Country> query = em.createNamedQuery("READ_ALL_ADRESS" , Country.class);
		final List<Country> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
