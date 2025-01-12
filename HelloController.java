package com.dhirajfirstcode.dhirajfirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getName() {
        return "Hello Dhiraj!";
    }

}
