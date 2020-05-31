package com.example.TestProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test/{result}")
    public String getResult(@PathVariable("result") String result){

        return result;
    }

    @GetMapping("/hello")
    public String getResponse(){
        return "hello world";
    }
}
