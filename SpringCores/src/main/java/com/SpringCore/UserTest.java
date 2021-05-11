package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Model.Emps;
import com.SpringCore.Model.User;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("listUser.xml");
		User s = (User)ac.getBean("userObj");
		System.out.println(s);

	}

}
