package com.dgvspammer.springpractice1.quoters;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
@Profiling
public class TerminatorQuoter implements Quoter{

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String message = "I'll be back";

    @PostConstruct
    public void initMethod(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }
    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 3");
        for (int i = 0; i < repeat; i++){
            System.out.println("message = " + message);
        }
    }
}
