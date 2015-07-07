package com.minimarket.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADRESS")
@Inheritance(strategy = InheritanceType.JOINED)
public class AdressImpl extends MiniMarketAbstractUtils implements Adress{
	
	@Id
	@Column(name="ADRESS_ID" , nullable = false , length = MAX_ID_LENTH)
	private Long adressId;
	
	@Column(name="STREET_NUMBER" , nullable = false , length=MAX_LENGTH_STREET_NUMBER)
	private Integer streetNumber;
	
	@Column(name="ADRESS_NAME" , nullable = false , length=MAX_TEXT_LENTGH)
	private String adressName;
	
	@Column(name="ZIP_CODE" , nullable = false , length = MAX_LENGTH_ZIP_CODE)
	private Integer zipCode;
	
	@OneToOne(targetEntity=CountryImpl.class , cascade = {CascadeType.ALL})
	@JoinColumn(name="COUNTRY_ID")
	private Country country;
	
	
	@Override
	public Long getAdressId() {
		// TODO Auto-generated method stub
		return adressId;
	}

	@Override
	public void setAdressId(Long adressId) {
		// TODO Auto-generated method stub
		this.adressId=adressId;
	}

	@Override
	public Integer getStreetNumber() {
		// TODO Auto-generated method stub
		return streetNumber;
	}

	@Override
	public void setStreetNumber(Integer streetNumber) {
		// TODO Auto-generated method stub
		this.streetNumber=streetNumber;
	}

	@Override
	public String getAdressName() {
		// TODO Auto-generated method stub
		return adressName;
	}

	@Override
	public void setAdressName(String adressName) {
		// TODO Auto-generated method stub
		this.adressName=adressName;
	}

	@Override
	public Integer getZipCode() {
		// TODO Auto-generated method stub
		return zipCode;
	}

	@Override
	public void setZipCode(Integer zipCode) {
		// TODO Auto-generated method stub
		this.zipCode=zipCode;
	}

	@Override
	public Country getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	public void setCountry(Country country) {
		// TODO Auto-generated method stub
		this.country=country;
	}

}
