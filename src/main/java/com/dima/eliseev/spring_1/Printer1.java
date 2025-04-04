package com.dima.eliseev.spring_1;

import org.springframework.stereotype.Component;

interface IPrinter{
    void Print();
}

@Component
public class Printer1 implements IPrinter{

    @Override
    public void Print() {
        System.out.println("P1");
    }
}

