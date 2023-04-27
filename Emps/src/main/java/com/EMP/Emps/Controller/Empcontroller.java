package com.EMP.Emps.Controller;

import com.EMP.Emps.Entity.employee;
import com.EMP.Emps.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class Empcontroller
{
    @Autowired
    public EmpService serv;
    @PostMapping("/add")
    public employee addEmployee(@RequestBody employee employee)
    {
        return serv.createEmployee(employee);
    }
    @GetMapping("/get")

    public List<employee> getAllEmployee()
    {
        return serv.getEmployee();
    }
    @GetMapping("/get/{id}")

    public employee getEmployeeById(@PathVariable int id)
    {
        return serv.getEmployeeById(id);
    }
    @DeleteMapping("/deleteemployee/{id}")

    public String deleteEmployee(@PathVariable int id)
    {
        return serv.deleteEmployeeById(id);
    }

}
