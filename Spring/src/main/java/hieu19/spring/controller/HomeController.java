package hieu19.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class HomeController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello i'm hieu19";
    }
}
