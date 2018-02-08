package com.javase.lesson.oop;

public class MethodOverload {
	public static void main(String[] args) {
		MethodOverload mol = new MethodOverload();
		
		mol.test("apple", 4.98);
		mol.test("orange", 6);
		mol.test(12, "pear");
	}
	
	// 构造方法： 无参数
	public MethodOverload(){
		
	}
	
	// 构造方法：有参数
	public MethodOverload(String userName, String password){
		
	}

	// 方法的重载 1
	public void test(String name, double price) {
		System.out.println("test String double ...");
	}

	// 方法的重载 2
	public void test(String name, int price) {
		System.out.println("test String int ...");
	}
	
	// 方法的重载3
	public void test(int price, String name){
		System.out.println("test int String");
	}

}
