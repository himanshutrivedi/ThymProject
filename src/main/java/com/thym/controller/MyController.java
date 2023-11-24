package com.thym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class MyController {

    @GetMapping("/home")
    public String home(Model m){
        List<String> list= List.of("ram","lakshman","janki","hanuman");
        m.addAttribute("list",list);
        m.addAttribute("age",99);
        m.addAttribute("name","Himanshu Trivedi");
        m.addAttribute("name2","xyz abc");
        return "index";
    }
    @GetMapping("/test")
    public String test(){

        return "test";
    }

}

