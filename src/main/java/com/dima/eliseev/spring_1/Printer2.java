package com.dima.eliseev.spring_1;

import org.springframework.stereotype.Component;

@Component
public class Printer2 implements IPrinter{

    @Override
    public void Print() {
        System.out.println("P2");
    }
}
