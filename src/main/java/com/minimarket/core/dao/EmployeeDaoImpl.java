package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Employee;
import com.minimarket.core.domain.EmployeeImpl;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Employee create() {
		return (Employee) entityConfiguration.createEntityInstance(Employee.class.getName());
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return em.merge(employee);
	}

	@Override
	public void deleteEmployee(Employee employee) {
		em.remove(employee);
	}

	@Override
	public Employee readEmployeeById(Long employeeId) {
		return em.find(EmployeeImpl.class, employeeId);
	}

	@Override
	public List<Employee> readAllEmployees() {
		TypedQuery<Employee> query = em.createNamedQuery("READ_ALL_EMPLOYEE",Employee.class);
		final List<Employee> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
