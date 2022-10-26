package com.restfulwebservice.project.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/execute")
    public String execute(){
        return "execute";
    }
}
