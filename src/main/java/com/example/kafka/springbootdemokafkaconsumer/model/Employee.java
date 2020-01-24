package com.example.kafka.springbootdemokafkaconsumer.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String salary;
	
	public Employee() {

	}
		
	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary='").append(salary).append('\'');
        sb.append('}');
        return sb.toString();
	}
	
	
}
