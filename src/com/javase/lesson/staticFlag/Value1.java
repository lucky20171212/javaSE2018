package com.javase.lesson.staticFlag;

public class Value1 {

	static int c = 0;
	
	public Value1(){
		c = 15;
	}
	
	public Value1(int i){
		c = i;
	}
	
	public static void inc(){
		c++;
	}
}
