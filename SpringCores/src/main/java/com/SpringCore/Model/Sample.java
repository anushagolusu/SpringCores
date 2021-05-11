package com.SpringCore.Model;

public class Sample {
  String name;
  

public Sample() {
	System.out.println("Default Constructor");
}
public void setName(String name) {
	this.name = name;
}
public void display() {
	System.out.println("Welcome "+name);
}
public void init() {
	System.out.println("This bean is going through init");
}
public void destroy() {
	System.out.println("Bean will destroy now");
}
}
