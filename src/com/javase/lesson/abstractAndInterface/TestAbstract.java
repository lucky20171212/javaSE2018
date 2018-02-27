package com.javase.lesson.abstractAndInterface;
/*
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

}*/

public class TestAbstract{
	public static void main(String[] args) {
		Chinese ch = new Chinese();
		ch.speak();
		
		Person person = ch;
		person.speak();
		ch.display();
	}
}

abstract class Person{
	abstract void speak();
}

class Chinese extends Person{
	@Override
	void speak() {
		System.out.println("Speak Chinese");
	}
	
	void display(){
		System.out.println("中国人");
	}
}

