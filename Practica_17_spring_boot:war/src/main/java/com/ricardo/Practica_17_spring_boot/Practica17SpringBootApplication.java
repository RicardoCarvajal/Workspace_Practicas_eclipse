package com.ricardo.Practica_17_spring_boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Practica17SpringBootApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Practica17SpringBootApplication.class);
    }

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(Practica17SpringBootApplication.class);

        app.setBannerMode(Banner.Mode.OFF);

        app.run(args);

    }

}
