package com.example.demo.controller;

import com.example.demo.dto.request.HelloWorldRequest;
import com.example.demo.dto.response.HelloWorldResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public HelloWorldResponse getHelloWorld(){
        return new HelloWorldResponse("what's up?");
    }

    @GetMapping("/hello/{name}")
    public HelloWorldResponse getDetails(@PathVariable String name){
        return new HelloWorldResponse("Hello, " + name + "!");
    }

    @PostMapping("/hello")
    public HelloWorldResponse postHelloWorld(@RequestBody HelloWorldRequest request){
        return new HelloWorldResponse("Hello " + request.getData() +  " !");
    }

}
