package com.javase.lesson.abstractNewFeatures;

/**
 * JDK8接口新特性：
 * 		1、方法可以有方法体。使用default或static修饰
 * 		2、在实现类中可以使用子类对象调用使用default修饰的方法，static修饰的方法要使用接口名称调用。
 *
 */
public interface InterfaceFeature {

	default void test(){
		System.out.println("ceshi ........");
	}
	
	default void set(){
		
	}
	
	static void get(){
		System.out.println("get ...");
	}
}
