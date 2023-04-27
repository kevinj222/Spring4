package com.UST.interview.Service;

import com.UST.interview.Entity.Inter;
import com.UST.interview.Repo.InterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InterServ
{
    @Autowired
    public InterRepo repo;

    public Inter add(Inter inter)
    {
       return repo.save(inter);
    }

    public List<Inter> get()
    {
        return  repo.findAll();
    }

    public Inter getid(long id)
    {
        return repo.findById(id).orElse(null);

    }

}
