package com.minimarket.core.domain;

public interface Employee {

	Long getEmployeeNumber();

	void setEmployeeNumber(Long employeeNumber);

	String getLastName();

	void setLastName(String lastName);

	String getFirstName();

	void setFirstName(String firstName);

	String getExtension();

	void setExtension(String extension);

	String getEmail();

	void setEmail(String email);

	Office getOfficeCode();

	void setOfficeCode(Office office);

	Long getReportsTo();

	void setReportsTo(Long reportsTo);

	String getJobTitle();

	void setJobTitle(String jobTitle);

}
