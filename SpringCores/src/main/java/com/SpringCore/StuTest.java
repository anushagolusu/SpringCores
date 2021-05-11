package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Model.Stu;

public class StuTest {
 public static void main(String[] args) {
	 ApplicationContext ctx=new AnnotationConfigApplicationContext("Config.class");
	 Stu s=(Stu)ctx.getBean("myStu");
	 System.out.println(s.dispStudent());
 }
}
