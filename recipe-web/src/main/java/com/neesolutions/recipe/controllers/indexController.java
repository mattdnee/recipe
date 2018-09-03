package com.neesolutions.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping({"", "/", "index.html", "/index.html", "index", "/index"})
    public String index(){
        return "index";
    }
}
