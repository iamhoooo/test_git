package com.example2.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // RestController 어노테이션을 통해 MainController클래스가 Controller 역할을 하는 것임을 설정한다. RestController의 주용도는 Json형태로 객체 데이터를 반환 하는것.
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name", defaultValue = "AI") String name) {
        return "main";
    }
}
