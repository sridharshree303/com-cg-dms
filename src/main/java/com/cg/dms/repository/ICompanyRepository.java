package com.cg.dms.repository;

import java.util.List;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Dealer;
import com.cg.dms.entities.Farmer;
import com.cg.dms.exception.CompanyNotFoundException;

public interface ICompanyRepository {
	public Company insertCompany(Company company);
	public Company updateCompany(Company company) throws CompanyNotFoundException;
	public Company deleteCompany(Company company) throws CompanyNotFoundException;
	public List<Farmer> getAllFormers();
	public Farmer getFormer(int farmerId);
    public List<Dealer> getAllDealers();
	public List<Dealer> getDealer(int dealerId);

}