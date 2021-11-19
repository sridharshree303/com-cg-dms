package com.cg.dms.repository;

import java.util.List;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Farmer;

public interface IFormerRepository {
	
	public Farmer validateFarmer(String username, String password) throws Exception;
	public Farmer addFarmer(Farmer user);
	public Farmer updateFarmer(Farmer user);
	public List<Farmer> getAllFarmer();
	public List<Farmer> getFarmer(int dealerId);
	public Company getCompany();
}
