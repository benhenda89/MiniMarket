package com.minimarket.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_OFFICE_XREF")
@Inheritance (strategy = InheritanceType.JOINED)
public class EmployeeOfficeXrefImpl extends MiniMarketAbstractUtils implements EmployeeOfficeXref{
	
	@Id
	@Column(name="EMPLOYEE_OFFICE_XREF_ID" , nullable =false , length = MAX_ID_LENTH)
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long employeeOfficeXref;
	
	@ManyToOne(targetEntity = EmployeeImpl.class , optional =false)
	@JoinColumn(name="employeeNumber")
	private Employee employee = new EmployeeImpl();
	
	@ManyToOne(targetEntity = OfficeImpl.class , optional = false)
	@JoinColumn(name = "officeCode")
	private Office office;
	
	@Override
	public long getEmployeeOfficeXref() {
		// TODO Auto-generated method stub
		return employeeOfficeXref;
	}

	@Override
	public void setEmployeeOfficeXref(Long employeeOfficeXref) {
		// TODO Auto-generated method stub
		this.employeeOfficeXref = employeeOfficeXref;
	}

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return employee;
	}

	@Override
	public void setEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employee = employee;
	}

	@Override
	public Office getOffice() {
		// TODO Auto-generated method stub
		return office;
	}

	@Override
	public void setOffice(Office office) {
		// TODO Auto-generated method stub
		this.office = office;
	}

}
