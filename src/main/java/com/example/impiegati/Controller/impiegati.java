package com.example.impiegati.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "imp")
public class impiegati {
    @GetMapping (path = "/add")
    public @ResponseBody
    String add(@RequestParam String name,@RequestParam String work ) {
        return " Il/la sig. "+name + " lavora come " +work ;
    }

    @GetMapping ( path = "/fired")
    public @ResponseBody
    String remove(@RequestParam String name) {
        return " Il/la sig. "+name + " è stato licenziato " ;
    }
    
}
