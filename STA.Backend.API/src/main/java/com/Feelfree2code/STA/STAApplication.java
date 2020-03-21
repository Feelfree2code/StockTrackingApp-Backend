package com.Feelfree2code.STA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.Feelfree2code.STA"})
public class STAApplication {
    
    public static void main(String[] args) {
            SpringApplication.run(STAApplication.class, args);
    }
}