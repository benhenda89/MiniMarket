package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Country;

public interface CountryDao {
	
	public Country create();
	
	public Country saveCountry(Country country);
	
	public void deleteCountry(Country country);
	
	public Country readCountryById(Long countryId);
	
	public List<Country> readAllCountry();
}
