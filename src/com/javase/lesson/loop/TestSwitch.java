package com.javase.lesson.loop;

public class TestSwitch {

	public static void main(String[] args) {

		TestSwitch.getGradeLevel(90);
	}
	
	/**
	 * 使用Switch判断学生的成绩等级
	 * @param grade
	 */
	public static void getGradeLevel(int grade){
		int level = grade/10;
		switch(level){
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
	}
}
