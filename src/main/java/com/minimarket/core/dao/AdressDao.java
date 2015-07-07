package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Adress;

public interface AdressDao {
	
	public Adress create();
	
	public Adress saveAdress(Adress adress);
	
	public void deleteAdress(Adress adress);
	
	public Adress readAdressById(Long adressId);
	
	public List<Adress> readAllAdress();
}
