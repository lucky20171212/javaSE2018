package com.javase.lesson.staticFlag;

public class Count {

	public static Value1 v1;
	public static Value1 v2;
	
	Value1 v = new Value1(10);
	
	static{
		prt("v1.c = " + v1.c + " , v2.c = " + v2.c);
		
		v1 = new Value1(27);
		prt("v1.c = " + v1.c + " , v2.c = " + v2.c);

		v2 = new Value1(15);
		prt("v1.c = " + v1.c + " , v2.c = " + v2.c);
		
	}
	
	public static void prt(String s){
		System.out.println(s);
	}
}
