package com.mycompany.tictactoeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 

@SpringBootApplication
@RestController
public class WebSiteController {

 

    public static void main(String[] args) {
        SpringApplication.run(WebSiteController.class, args);
    }

 

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(
            value = "/status",
            produces = "application/json"
    )
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. "
                + java.time.LocalDate.now() + ", "
                + java.time.LocalTime.now()
                + ". " + "The server is Runnig!\"}";
    }

 

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}