package com.dgvspammer.springpractice1.quoters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

    }
}
