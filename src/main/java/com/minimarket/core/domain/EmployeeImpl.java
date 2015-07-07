package com.minimarket.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class EmployeeImpl extends MiniMarketAbstractUtils implements Employee{
	 
	 @Id
	 @Column(name="employeeNumber" , nullable = false , length = MAX_ID_LENTH)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long 		employeeNumber;
	 
	 @Column(name="lastName" , nullable = false , length = MAX_TEXT_LENTGH)
	 private String  	lastName;
	 
	 @Column(name="firstName" , nullable = false , length = MAX_TEXT_LENTGH)
	 private String 	firstName;
	 
	 @Column(name="extension" , nullable = false , length = MAX_EXTENSION_LENGTH)
	 private String 	extension;
	 
	 @Column(name="email" , nullable = false , length = MAX_EMAIL_LENGTH)
	 private String 	email;
	 
	 @ManyToOne(targetEntity = OfficeImpl.class)
	 @JoinColumn(name = "officeCode")
	 private Office office;
	 
	 @Column(name="reportsTo" , nullable = false , length = MAX_ID_LENTH)
	 private Long 		reportsTo;
	 
	 @Column(name="jobTitle" , nullable = false , length = MAX_TEXT_LENTGH)
	 private String 	jobTitle;
	 
	@Override 
	public Long getEmployeeNumber() {
		return employeeNumber;
	}
	
	@Override
	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Override
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String getFirstName() {
		return firstName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String getExtension() {
		return extension;
	}
	
	@Override
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public Long getReportsTo() {
		return reportsTo;
	}
	
	@Override
	public void setReportsTo(Long reportsTo) {
		this.reportsTo = reportsTo;
	}
	
	@Override
	public String getJobTitle() {
		return jobTitle;
	}
	
	@Override
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public Office getOfficeCode() {
		// TODO Auto-generated method stub
		return office;
	}

	@Override
	public void setOfficeCode(Office office) {
		// TODO Auto-generated method stub
		this.office = office;
	}
	 
}
