package com.telisko.telisko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    Computer laptopVar;

    public void build(){
        System.out.println("This is building!");
        laptopVar.compile();
    }
}
