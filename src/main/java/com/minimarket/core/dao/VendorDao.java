package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Vendor;

public interface VendorDao {
	
	public Vendor create();
	
	public Vendor saveVendor(Vendor vendor);
	
	public void deleteVendor(Vendor vendor);
	
	public Vendor readVendorById(Long vendorId);
	
	public List<Vendor> getAllVendors();
}
