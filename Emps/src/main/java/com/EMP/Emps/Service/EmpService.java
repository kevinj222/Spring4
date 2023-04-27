package com.EMP.Emps.Service;

import com.EMP.Emps.Entity.employee;
import com.EMP.Emps.Repo.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpService
{
    @Autowired
    private Emprepo repo;
    public employee createEmployee(employee employee)
    {
        return repo.save(employee);
    }

    public List<employee> getEmployee()
    {
        return repo.findAll();
    }

    public employee getEmployeeById(int id)
    {
        return repo.findById(id).orElse(null);
    }

    public String deleteEmployeeById(int id)
    {
        repo.deleteById(id);
        return"The employee info is deleted";
    }
}
