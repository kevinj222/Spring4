package com.EMP.Emps.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.EMP.Emps.Entity.employee;
@Repository

public interface Emprepo extends JpaRepository<employee,Integer>
{

}
