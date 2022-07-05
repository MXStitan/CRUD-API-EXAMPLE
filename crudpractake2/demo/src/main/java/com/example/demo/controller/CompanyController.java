package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Company;
//import com.example.demo.repository.CompanyRepository;
import com.example.demo.service.CompanyService;

import java.util.List;

import javax.validation.Valid;

@RestController
public class CompanyController {

@Autowired
CompanyService companyService;


//@GetMapping("/home")
//private List<Company> getAllCompany(){
//	return companyService.getAllCompany();
//}
@GetMapping("/home")
private List<Company> getAllCompany(){
	return companyService.findAll();
}



@GetMapping("/home/{id}")
private Company getCompany(@PathVariable ("id") int id) {
	return companyService.getCompanyById(id);
}


@DeleteMapping("/home/{id}")
private void deleteCompany(@PathVariable ("id") int id) {
	companyService.delete(id);
}
@PutMapping("/add")
private Company update(@RequestBody Company company) {
	companyService.SaveOrUpdate(company);
	return company;
}
//@PostMapping("/add")
//private String saveCompany(@RequestBody List<Company> company)   
//{  
//companyService.saveOrUpdateAll(company);  
//return "save all records";  
////return Books books;
//}  
@PostMapping("/add")
public Company saveCompany(@Valid @RequestBody Company company) {
    return companyService.save(company);
}


}
