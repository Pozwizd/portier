package com.roman.portier;

import com.roman.portier.config.MvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortierApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortierApplication.class, args);
    }

}
