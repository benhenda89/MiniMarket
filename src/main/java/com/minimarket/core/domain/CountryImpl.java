package com.minimarket.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="COUNTRY")
@Inheritance(strategy = InheritanceType.JOINED)
public class CountryImpl extends MiniMarketAbstractUtils implements Country{
	
	@Id
	@Column(name="COUNTRY_ID" , nullable = false , length = MAX_ID_LENTH)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;
	
	@Column(name="COUNTRY_PREFIX" , nullable = false , length = MAX_LENGTH_COUNTRY_PREFIX)
	private String countryPrefix;
	
	@Column(name="COUNTRY_NAME" , nullable = false , length = MAX_TEXT_LENTGH)
	private String countryName;
	
	@Override
	public Long getCountryId() {
		// TODO Auto-generated method stub
		return countryId;
	}

	@Override
	public void setCountryId(Long countryId) {
		// TODO Auto-generated method stub
		this.countryId = countryId;
	}

	@Override
	public String getCountryPrefix() {
		// TODO Auto-generated method stub
		return countryPrefix;
	}

	@Override
	public void setCountryPrefix(String countryPrefix) {
		// TODO Auto-generated method stub
		this.countryPrefix = countryPrefix;
	}

	@Override
	public String getCountryName() {
		// TODO Auto-generated method stub
		return countryName;
	}

	@Override
	public void setCountryName(String countryName) {
		// TODO Auto-generated method stub
		this.countryName = countryName;
	}

}
