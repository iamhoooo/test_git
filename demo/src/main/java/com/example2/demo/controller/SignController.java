package com.example2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignController {
    @RequestMapping(value = "/sign", method = RequestMethod.GET)
    public String signIn(){
        return "sign-in";
    }

}
