package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.entities.Company;

//@Repository

public interface CompanyRepository extends CrudRepository <Company, Integer>
{

}
