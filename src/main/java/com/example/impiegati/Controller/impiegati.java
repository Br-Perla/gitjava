package com.example.impiegati.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (path = "impp")
public class impiegati {
    @GetMapping (path = "/add")
    public @ResponseBody
    String add(@RequestParam String name,@RequestParam String lavoro ) {
        return " Il/la sig. "+name + " lavora come " +lavoro ;
    }
    
}
