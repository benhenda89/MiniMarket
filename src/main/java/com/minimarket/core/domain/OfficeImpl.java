package com.minimarket.core.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class OfficeImpl extends MiniMarketAbstractUtils implements Office{
	
	@Id
	@Column(name="officeCode" , nullable = false , length = MAX_OFFICE_CODE_LENGHT)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String officeCode ;
	
	@Column(name="city" , nullable = false , length = MAX_TEXT_LENTGH)
	private String city;
	
	@Column(name="phone" , nullable = false , length = MAX_TEXT_LENTGH)
	private String phone;
	
	@Column(name="addressLine1" , nullable = false , length = MAX_TEXT_LENTGH)
	private String addressLine1;
	
	@Column(name="addressLine2" , nullable = true , length = MAX_TEXT_LENTGH)
	private String addressLine2;
	private String state;
	
	@Column(name="country" , nullable = true , length = MAX_TEXT_LENTGH)
	private String country;
	
	@Column(name="postalCode" , nullable = false , length = MAX_TEXT_LENTGH)
	private String postalCode;
	
	@Column(name="territory" , nullable = false , length = MAX_TERRITORY_LENGTH)
	private String territory;
	
	@OneToMany(targetEntity = EmployeeImpl.class , mappedBy = "office" , orphanRemoval = true , 
				cascade = {CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH} )
	private List<Employee> employees;
	
	@Override
	public String getOfficeCode() {
		return officeCode;
	}
	
	@Override
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	@Override
	public String getCity() {
		return city;
	}
	
	@Override
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String getPhone() {
		return phone;
	}
	
	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String getAddressLine1() {
		return addressLine1;
	}
	
	@Override
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	@Override
	public String getAddressLine2() {
		return addressLine2;
	}
	
	@Override
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	@Override
	public String getState() {
		return state;
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String getCountry() {
		return country;
	}
	
	@Override
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String getPostalCode() {
		return postalCode;
	}
	
	@Override
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String getTerritory() {
		return territory;
	}
	
	@Override
	public void setTerritory(String territory) {
		this.territory = territory;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public void setEmployees(List<Employee> employees) {
		// TODO Auto-generated method stub
		this.employees = employees;
	}
	
}
