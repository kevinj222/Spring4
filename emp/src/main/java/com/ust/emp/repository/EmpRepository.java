package com.ust.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.emp.model.EmpModel;
@Repository

public interface EmpRepository extends JpaRepository<EmpModel,Integer>
{

}
