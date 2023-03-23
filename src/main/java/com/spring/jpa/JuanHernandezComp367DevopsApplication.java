package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JuanHernandezComp367DevopsApplication {

	@RequestMapping("/")
    public String home() {
        return "<h1>Welcome</h1>";
    }
  
    public static void main(String[] args) {
        SpringApplication.run(JuanHernandezComp367DevopsApplication.class, args);
    }

}
