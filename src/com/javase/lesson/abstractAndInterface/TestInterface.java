package com.javase.lesson.abstractAndInterface;

public class TestInterface implements InterfaceClass3 {

	@Override
	public void insert() {
		System.out.println("InterfaceClass1接口中的方法。被InterfaceClass3接口继承");
	}

	@Override
	public void update() {
		System.out.println("InterfaceClass2接口中的方法。被InterfaceClass3接口继承");
	}

	@Override
	public void delete() {
		System.out.println("InterfaceClass3接口中的方法。");
	}

	public static void main(String[] args){
		TestInterface ti = new TestInterface();
		ti.insert();
		ti.delete();
		ti.update();
	}
}
