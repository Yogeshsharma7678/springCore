package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class devoloper {
	
	@Autowired
	laptop lp;  //injecting 
    
	public laptop getLp() {
		return lp;
	}

	public void setLp(laptop lp) {
		this.lp = lp;
	}

	public void coding() {
		
		System.out.println("\n hello , i can coding......!");
		lp.deploy();
	}

}
