package com.demo.starter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello World!";
    }
    @PostMapping("/hello")
    public String HelloPost(@RequestBody String name){
        return "Hello" + name;
    }
}
