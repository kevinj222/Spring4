package com.ust.emp.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.emp.model.EmpModel;
import com.ust.emp.service.EmpService;



@RestController
@RequestMapping("/reg")
@CrossOrigin("*")
public class EmpController 
{
	@Autowired
	public EmpService EmployeeService;
	@PostMapping("/addemps")
	
	public EmpModel addEmployee(@RequestBody EmpModel employee)
	{
		return EmployeeService.createEmployee(employee);
	}
	@GetMapping("/employees")
	
		public List<EmpModel> getAllEmployee()
		{
			return EmployeeService.getEmployee();
		}
	
	@GetMapping("/employees/{id}")
	
		public EmpModel getEmployeeById(@PathVariable int id)
		{
			return EmployeeService.getEmployeeById(id);
		}
	@PutMapping("/updateemployee/{id}")
	public EmpModel updateEmployee(@RequestBody EmpModel employee)
	{
		return EmployeeService.updateEmployee(employee);
	}

	@DeleteMapping("/deleteemployee/{id}")
	
	public String deleteEmployee(@PathVariable int id)
		{
		return EmployeeService.deleteEmployeeById(id);
	}
	
}
