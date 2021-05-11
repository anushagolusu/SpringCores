package com.SpringCore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Model.Sample;

public class SampTest {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("appConfig.xml");
		Sample s = (Sample)ac.getBean("sample");
		s.display();
		Sample s1 = (Sample)ac.getBean("sample");
		s1.display();
		ac.registerShutdownHook();

	}

}
