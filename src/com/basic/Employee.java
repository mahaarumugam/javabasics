package com.basic;

public class Employee {
	private double salary;
	private String name;
	public static void main(){
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String args[])
	{ Employee e1=new Employee();
	 e1.setName("name1");
	 e1.setSalary(100000);
	 Employee e2=new Employee();
	 e2.setName("name2");
	 e2.setSalary(200000);
	 double salary=e1.getSalary();
	 salary=salary*1.1;
	 e1.setSalary(salary);
	 System.out.println(e1.getSalary());
}
}