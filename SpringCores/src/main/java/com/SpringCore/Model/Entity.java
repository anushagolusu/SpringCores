package com.SpringCore.Model;

public class Entity {
 int empNo;
 String empName;
 double salary;
public Entity(int empNo, String empName, double salary) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.salary = salary;
}
@Override
public String toString() {
	return "Entity [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
}
 
}
