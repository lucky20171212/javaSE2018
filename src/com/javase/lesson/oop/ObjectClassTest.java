package com.javase.lesson.oop;

public class ObjectClassTest {
	
	public static void main(String[] args) {
		//     对象的引用   = 对象（即new XX）
		Person1 lily = new Person1("Lily", 20);
		Person1 lucy;
		lucy = new Person1("Lucy", 10);
		
		lily.showInfo();
		System.out.println(lucy.getName());
		
		Person1[] persons = {new Person1("Lily", 20), new Person1("Lucy", 10)};
		System.out.println(persons[0].getName() + " " + persons[0].getAge());
	}

}

class Person1{
	private String name;
	private int age;
	
	public Person1(){
		
	}

	public Person1(String name){
		this.name = name;
		
	}
	public Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showInfo(){
		System.out.println("userName : " + name + "   ,age : " + age);
	}
	
	public void showInfo(String name, int age){
		System.out.println("userName : " + name + "   ,age : " + age);
	}
	
	public void showInfo(String name){
		System.out.println("--> userName: " + name);
	}
	
	public void showInfo(int age){
		System.out.println("-->> age : " + age);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
}
