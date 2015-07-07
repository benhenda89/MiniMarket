package com.minimarket.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="VENDOR")
@Inheritance(strategy=InheritanceType.JOINED)
public class VendorImpl extends MiniMarketAbstractUtils implements Vendor{
	
	@Id
	@Column(name="VENDOR_ID" , nullable=false , length = MAX_ID_LENTH)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vendorId;
	
	@Column(name="VENDOR_NAME",nullable=false,length=MAX_TEXT_LENTGH)
	private String vendorname;
	
	@OneToOne(targetEntity=AdressImpl.class,cascade={CascadeType.ALL})
	@JoinColumn(name="ADRESS_ID")
	@Cascade(value={org.hibernate.annotations.CascadeType.ALL})
	private Adress adress;
	
	@Override
	public Long getVendorId() {
		// TODO Auto-generated method stub
		return vendorId;
	}

	@Override
	public void setVendorId(Long vendorId) {
		// TODO Auto-generated method stub
		this.vendorId=vendorId;
	}

	@Override
	public String getVendorname() {
		// TODO Auto-generated method stub
		return vendorname;
	}

	@Override
	public void setVendorName(String vendorName) {
		// TODO Auto-generated method stub
		this.vendorname=vendorName;
	}

	@Override
	public Adress getAdress() {
		// TODO Auto-generated method stub
		return adress;
	}

	@Override
	public void setAdress(Adress adress) {
		// TODO Auto-generated method stub
		this.adress=adress;
	}
}
