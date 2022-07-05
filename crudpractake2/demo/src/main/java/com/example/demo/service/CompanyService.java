package com.example.demo.service;

//import java.util.ArrayList;
import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

//	public List<Company> getAllCompany(){
//	//	List<Company> company=new ArrayList<Company>();
//		return (List<Company>) companyRepository.findAll();
//	}

	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyRepository.findById(id).get();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		companyRepository.deleteById(id);
	}

	public void SaveOrUpdate(Company company) {
		// TODO Auto-generated method stub
		companyRepository.save(company);
	}


//	public void saveOrUpdateAll(List<Company> company) {
//		// TODO Auto-generated method stub
//		companyRepository.saveAll(company);
//
//	}

	public Company save(@Valid Company company) {
		// TODO Auto-generated method stub
		return companyRepository.save(company);
	}

	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return (List<Company>) companyRepository.findAll();
	}

}
