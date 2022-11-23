package edu.ntudp.sau.kocherhajavalabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    @GetMapping("")
    String getStarting(@RequestParam(defaultValue = "17") String age){
        if(Integer.parseInt(age)>=18){
            return "index";
        }
        else return "error";
    }
    @GetMapping("/learn_more")
    String goToNextPage(){
        return "learn_more";
    }
    @GetMapping("/main_page")
    String goToFirstPage(){
        return "index";
    }
}
