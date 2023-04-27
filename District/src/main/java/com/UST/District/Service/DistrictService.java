package com.UST.District.Service;

import com.UST.District.Entity.Districting;
import com.UST.District.Repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService
{
    @Autowired
    DistrictRepository repo;
    public Districting getstate(String State)
    {
        return repo.findByState(State);

    }
}
