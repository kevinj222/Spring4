package com.ust.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.emp.model.EmpModel;
import com.ust.emp.repository.EmpRepository;

@Service
public class EmpService 
{
	@Autowired
	private EmpRepository repo;
	
	public  EmpModel createEmployee(EmpModel employee) 
	{
	 return repo.save(employee);
	}
		

	public  List<EmpModel> getEmployee() 
	{
		return repo.findAll();
	}

	public EmpModel getEmployeeById(int id) 
	{
		return repo.findById(id).orElse(null);
	}

	public  EmpModel updateEmployee(EmpModel employee)
	{
	EmpModel oldemp=null;
	Optional<EmpModel>optionalemployee=repo.findById(employee.getId());
	if(optionalemployee.isPresent())
	{
		oldemp=optionalemployee.get();
		oldemp.setName(employee.getName());
		oldemp.setEmail(employee.getEmail());
		oldemp.setExperience(employee.getExperience());
		repo.save(oldemp);
	}
	else
	{
		return new EmpModel();
	}
	return oldemp;
	}

	public String deleteEmployeeById(int id) 
	{
		repo.deleteById(id);
		return"The employee info is deleted";
	}
}
