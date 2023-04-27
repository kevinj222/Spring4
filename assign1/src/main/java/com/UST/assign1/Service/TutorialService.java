package com.UST.assign1.Service;

import com.UST.assign1.Entity.Tutorial;
import com.UST.assign1.Repository.Tutorialrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialService
{
    @Autowired
    public Tutorialrepo repo;

    public Tutorial addtutorial(Tutorial tutorial)
    {
        return  repo.save(tutorial);
    }

    public List<Tutorial> gettutorial()
    {
        return repo.findAll();
    }

    public Tutorial getbyid(int id)
    {
        return repo.findById(id);
    }

    public String deleteid(Integer id)
    {
        repo.deleteById(id);
        return "info is deleted";

    }
}
