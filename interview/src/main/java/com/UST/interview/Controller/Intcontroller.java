package com.UST.interview.Controller;

import com.UST.interview.Entity.Inter;
import com.UST.interview.Service.InterServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/int")
public class Intcontroller
{
    @Autowired
    public InterServ serv;
    @PostMapping("/add")
    public Inter addinter(@RequestBody Inter inter)
    {
    return serv.add(inter);

    }
    @GetMapping("/all")
    public List<Inter> getinterview()
    {
       return serv.get();
    }
    @GetMapping("/all/{id}")
    public Inter getinterviewid(@PathVariable long id)
    {
        return serv.getid(id);
    }

}
