package com.Sharath.motors.Controller;

import com.Sharath.motors.Entity.Cars;
import com.Sharath.motors.Service.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharath")
public class CarController
{
    @Autowired
    private Carservice carservice;
    @PostMapping("/addcars")
    private Cars addcars(@RequestBody Cars cars)
    {
        return carservice.addallcars(cars);
    }
    @GetMapping("/cars")
    public List<Cars> getallcars()
    {
        return carservice.gettallcars();
    }
    @GetMapping("/cars/{availdate}")
    public List<Cars> getcarbydate(@PathVariable String availdate)
    {
        return  carservice.getcarbydate(availdate);
    }

}
