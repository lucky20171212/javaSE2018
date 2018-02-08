package com.javase.lesson.oop;

public class Person {

	String name;
	int age;
	
	public Person(){
		System.out.println("Person类的无参构造方法");
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}
