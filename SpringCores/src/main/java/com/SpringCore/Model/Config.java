package com.SpringCore.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringCore.Model.Stu;

@Configuration
public class Config {
    
	@Bean(value="myStu")
	public Stu createStudent() {
		Stu s=new Stu();
		s.setName("Anusha");
		return s;
		
	}
}
