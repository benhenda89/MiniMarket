package com.minimarket.core.domain;

public interface Vendor {
	
	public Long getVendorId();
	
	public void setVendorId(Long vendorId);
	
	public String getVendorname();
	
	public void setVendorName(String vendorName);
	
	public Adress getAdress();
	
	public void setAdress(Adress adress);
}
