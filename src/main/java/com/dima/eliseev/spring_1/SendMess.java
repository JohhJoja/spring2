package com.dima.eliseev.spring_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendMess{
    private IPrinter printer;

    @Autowired
    public SendMess(IPrinter printer) {
        this.printer = printer;
    }
    public void Mess(){
        printer.Print();
    }
}


