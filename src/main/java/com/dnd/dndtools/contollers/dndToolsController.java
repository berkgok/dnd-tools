package com.dnd.dndtools.contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class dndToolsController {

    @GetMapping
    public String getPage(){
        return "dnd_tools.html";
    }

}
