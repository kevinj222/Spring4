package com.UST.assign1.Controller;

import com.UST.assign1.Entity.Tutorial;
import com.UST.assign1.Service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutorial")
public class TutoriatController
{
    @Autowired
    private TutorialService serv;
    @PostMapping("/add")
    private Tutorial addtutorial(@RequestBody Tutorial tutorial)
    {
        return serv.addtutorial(tutorial);
    }
    @GetMapping("/get")
    private List<Tutorial>getall()
    {
        return serv.gettutorial();
    }

    @GetMapping("/get/id")
    private Tutorial getbyid(@PathVariable Integer id)
    {
        return serv.getbyid(id);
    }
    @DeleteMapping("/del/id")
    private Tutorial deletebyid(@PathVariable Integer id)
    {
        return  serv.deleteid(id);

    }
}
