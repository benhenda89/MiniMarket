package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Office;

public interface OfficeDao {
	
	public Office create();
	
	public Office saveOfficce(Office office);
	
	public void deleteOffice(Office office);
	
	public Office readOfficeById(Long officeId);
	
	public List<Office> readAllOffices();
}
