package com.minimarket.core.domain;

public interface Adress {
	
	public Long getAdressId();
	
	public void setAdressId(Long adressId);
	
	public Integer getStreetNumber();
	
	public void setStreetNumber(Integer streetNumber);
	
	public String getAdressName();
	
	public void setAdressName(String adressName);
	
	public Integer getZipCode();
	
	public void setZipCode(Integer zipCode);
	
	public Country getCountry();
	
	public void setCountry(Country country);
}
