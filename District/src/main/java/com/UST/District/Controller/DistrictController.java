package com.UST.District.Controller;

import com.UST.District.Entity.Districting;
import com.UST.District.Service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/india")
public class DistrictController
{
    @Autowired
    public DistrictService serv;
    @GetMapping("/{State}")
    public Districting getDist(@PathVariable String State )
    {
        return serv.getstate(State);
    }
}
