package org.narainox.springSecurityLearnings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello ayush !";
    }
    @GetMapping("/helloGoodMorning")
    public String sayGoodMorning()
    {
        return "hello ayush good Morning !";
    }
}
