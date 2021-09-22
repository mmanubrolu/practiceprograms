package com.visa.java;

public class InheritanceSample {

	public static void main(String[] args) {
		Parent child1 = new Child1("Mallikarjuna", 42, "MCA");
		System.out.println("childs to string :: " + child1.toString());

	}

}

class Parent {
	protected String name;
	protected int age;
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
}

class Child1 extends Parent{

	String education;
	
	public Child1(String name, int age) {
		super(name, age);
		
	}

	public Child1(String name, int age, String education) {
		super(name, age);
		this.education = education;
	}

	@Override
	public String toString() {
		return "Child1 [education=" + education + ", name=" + name + ", age=" + age + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

class Child2 extends Parent {
	
	String education;
	
	public Child2(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Child2(String name, int age, String education) {
		super(name, age);
		this.education = education;
	}

	@Override
	public String toString() {
		return "Child2 [education=" + education + ", name=" + name + ", age=" + age + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}