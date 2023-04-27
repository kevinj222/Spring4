package com.Sharath.motors.Service;

import com.Sharath.motors.Entity.Cars;
import com.Sharath.motors.Repo.Carrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Carservice 
{
    @Autowired
    public Carrepo repo;
    public Cars addallcars(Cars cars) 
    {
       return repo.save(cars);
    }

    public List<Cars> gettallcars()
    {
        return repo.findAll();
    }

    public List<Cars> getcarbydate(String availdate)
    {
        return  repo.findByavaildate(availdate);
    }
}
