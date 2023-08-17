package com.brijesh.Jpa_demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo
{
	@Id
	private int roll;
	private String name;
	private int marks;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Demo [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
