package com.minimarket.core.domain;

import java.util.List;

public interface Office {

	String getOfficeCode();

	void setOfficeCode(String officeCode);

	String getCity();

	void setCity(String city);

	String getPhone();

	void setPhone(String phone);

	String getAddressLine1();

	void setAddressLine1(String addressLine1);

	String getAddressLine2();

	void setAddressLine2(String addressLine2);

	String getState();

	void setState(String state);

	String getCountry();

	void setCountry(String country);

	String getPostalCode();

	void setPostalCode(String postalCode);

	String getTerritory();

	void setTerritory(String territory);
	
	public List<Employee> getEmployees();
	
	public void setEmployees(List<Employee> employees);

}
