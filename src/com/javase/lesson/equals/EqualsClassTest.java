package com.javase.lesson.equals;

/**
 * equals: 比较两个对象的值是否相等；
 * == : 比较两个对象的值和内存地址是否都相等。
 */
public class EqualsClassTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		obj1 = obj2;
		System.out.println("obj1 == obj2 -> " + (obj1 == obj2) );
		System.out.println("obj1.equals(obj2) -> " + obj1.equals(obj2));
		System.out.println();
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println("str1 == str2 - > " + (str1 == str2));
		System.out.println("str1.equals(str2) -> " + str1.equals(str2));
		System.out.println();
		
		String str3 = "123";
		String str4 = "123";
		System.out.println("str3 == str4 - > " + (str3 == str4));
		System.out.println("str3.equals(str4) -> " + str3.equals(str4));
		System.out.println();
		
		Integer it1 = new Integer(1);
		Integer it2 = new Integer(1);
		System.out.println("it1 == it2 - > " + (it1 == it2));
		System.out.println("it1.equals(it2) -> " + it1.equals(it2));
		System.out.println();
		
		Integer it3 = 3;
		Integer it4 = 3;
		System.out.println("it3 == it4 - > " + (it3 == it4));
		System.out.println("it3.equals(it4) -> " + it3.equals(it4));
	}

}
