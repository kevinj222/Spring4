package com.Sharath.motors.Repo;

import com.Sharath.motors.Entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Carrepo extends JpaRepository<Cars,Integer>
{
    List<Cars> findByavaildate(String availdate);
}
