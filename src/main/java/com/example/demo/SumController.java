package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping(value = "/{num1}/{num2}")
    public APIOutput sum(@PathVariable("num1") int num1, @PathVariable("num2") int num2){
        return new APIOutput(num1+num2);
    }

    @GetMapping(value = "/{num1}")
    public APIOutput sum1(@PathVariable("num1") int num1){
        return new APIOutput(num1+10);
    }

    @GetMapping(value = "/")
    public APIOutput sum1(){
        return new APIOutput(0);
    }


}
