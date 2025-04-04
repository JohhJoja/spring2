package com.dima.eliseev.spring_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Spring1Application.class, args);
		SendMess SM = new SendMess(new Printer2());
		SM.Mess();
	}

}
















