package com.javase.lesson.abstractAndInterface;

public class TestAbstract extends AbstractClass{

	@Override
	public void display() {
		System.out.println("继承抽象类后，必须实现抽象类中的抽象方法。");
	}
	
	public static void main(String[] args){
		TestAbstract ta = new TestAbstract();
		ta.info();
		ta.display();
	}

}
