package com.dgvspammer.springpractice1.quoters;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Component
public @interface InjectRandomInt {
    int min();
    int max();
}
