package com.minimarket.core.domain;

public interface Country {
	
	public Long getCountryId();
	
	public void setCountryId(Long countryId);
	
	public String getCountryPrefix();
	
	public void setCountryPrefix(String countryPrefix);
	
	public String getCountryName();
	
	public void setCountryName(String countryName);
}
