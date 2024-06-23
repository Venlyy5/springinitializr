package com.example.springinitializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringinitializrApplication.class, args);
        //new SpringApplicationBuilder(SpringinitializrApplication.class).web(WebApplicationType.SERVLET).run(args);
        System.out.println("[SUCCESS]");
    }

}
