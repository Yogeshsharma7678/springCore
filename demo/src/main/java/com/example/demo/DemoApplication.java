package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext con =new ClassPathXmlApplicationContext("spring.xml");
		
		devoloper dv =con.getBean(devoloper.class);
		
		dv.coding();
	}

}
