package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("custConfig.xml");
		Customer s = (Customer)ac.getBean("custObj");
		System.out.println(s);
		}

}
