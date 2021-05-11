package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Model.Customer;
import com.SpringCore.Model.Emps;

public class listTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("listEmpConfig.xml");
		Emps s = (Emps)ac.getBean("empObj");
		System.out.println(s);
	}

}
