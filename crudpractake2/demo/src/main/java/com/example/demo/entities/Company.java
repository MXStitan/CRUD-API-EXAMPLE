package com.example.demo.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comp")
public class Company {

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column	
	private int id;
	@Column
	private String usernamee;
	@Column
	private String faculty;
	@Column
	private int salary;
	
	
	public Company(int id, String usernamee, String faculty, int salary) {
		super();
		this.id = id;
		this.usernamee = usernamee;
		this.faculty = faculty;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getusernamee() {
		return usernamee;
	}


	public void setusernamee(String usernamee) {
		this.usernamee = usernamee;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "Company [id=" + id + ", usernamee=" + usernamee + ", faculty=" + faculty + ", salary=" + salary + "]";
	}

	
	

}
