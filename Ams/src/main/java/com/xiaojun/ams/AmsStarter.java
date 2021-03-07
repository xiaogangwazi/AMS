package com.xiaojun.ams;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AmsStarter {
    public static void main(String[] args) {

        SpringApplication.run(AmsStarter.class,args);
        System.out.println("Ams system start successful!");
    }
}
