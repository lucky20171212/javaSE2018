package com.javase.lesson.loop;

import java.util.Scanner;

public class Pratise {

	public static void main(String[] args) {

		Pratise pra = new Pratise();
/*
		System.out.println("--> " + pra.sum(10, 5));
		System.out.println("-->> " + pra.testWhile());
		System.out.println("-->>> " + pra.testDoWhile());
		System.out.println("-->>> " + pra.testFor());
		*/
//		pra.calculator(); // 计算两个数的和差积商
		
//		boolean flag = pra.huiWenShu(12231);
//		System.out.println(flag);
		
//		System.out.println(pra.reverseNum(123434));
		
//		int num = pra.getNum();
//		System.out.println(num);

		int[] source = {10,9,8,7,6,5,4,3,2,1};
		int[] target = pra.bubbleSort(source);
		for(int i : target){
			System.out.print(i + " ");
		}
	}
	
	/**
	 * 冒泡排序
	 * @param source: 需要排序的数组
	 * @return: 排序后的数组
	 */
	public int[] bubbleSort(int[] source){
		int times = 0;
		while(times < source.length-1){
			for(int i = 0; i < source.length-1; i++){
				int temp = 0;
				if(source[i] > source[i+1]){
					temp = source[i];
					source[i] = source[i+1];
					source[i+1] = temp;
				}else{
					continue;
				}
			}
/*			System.out.print("第" + (times + 1) + "次排序结果： ");
			for(int i : source){
				System.out.print(i + "  ");
			}
			System.out.println();*/
			times++;
		}
		
		return source;
		
	}
	
	/**
	 * 如果N是一个四位数，它的9倍数正好是它的倒序，请输出N的值。
	 * @return: N的值
	 */
	public int getNum(){
		int result = 1000;
		
		while(result * 9 != reverseNum(result)){
			result ++;
			if(result >= 1000 && result <= 1111){
				continue;
			}else{
				System.out.println("没有满足条件的四位数.");
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * 一个数的反序数: 为getNum()方法提供的
	 * @param num
	 * @return: 指定数的反序数
	 */
	private static int reverseNum(int num){
		String nums = num + "";
		String[] numArray = nums.split("");
		String numStr = "";
		for(int i = 0; i < numArray.length; i++){
			numStr += numArray[numArray.length-1-i];
		}
		
		num = Integer.parseInt(numStr);
		return num;
	}
	
	/**
	 * 判断给定的数是否是回文数
	 * @param num
	 * @return:
	 * 		true: 是回文数
	 * 		false: 不是回文数
	 */
	public boolean huiWenShu(int num){
		String numStr = num + "";
		String[] numArray = numStr.split("");
		boolean flag = true;
		
		for(int i = 0; i < numArray.length/2; i++){
			if(numArray[i].equals(numArray[numArray.length-1-i])){
				flag = flag && true;
				continue;
			}else{
				flag = flag && false;
				break;
			}
		}
		return flag;
	}

	/**
	 * 控制台输入连个数，并计算这两个数的和差积商
	 */
	public void calculator() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个数字： ");
		float num1 = Integer.parseInt(scanner.next());
		
		float num2 = 0;
		while(num2 == 0){
			System.out.print("请输入第二个数字: ");
			num2 = Integer.parseInt(scanner.next());
			if(num2 == 0){
				System.out.println("【第二个数字不能为0，请重新输入。】");
			}
		}
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = "  + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = "  + (num1 / num2));
		
		scanner.close();
		
	}

	/**
	 * 增强型for循环
	 * 
	 * @return
	 */
	public int testFor() {
		int total = 0;

		int[] arrays = { 1, 2, 3, 4, 5, 6 }; // 数组的静态初始化
		for (int i : arrays) {
			total += i;
		}

		return total;
	}

	/**
	 * 使用do...while 计算： 已知 1 * 2 + 2 * 3 + 3 * 4 + ... + n * ( n + 1 ) <
	 * 1000，求n的最大值。
	 * 
	 * @return
	 */
	public int testDoWhile() {
		int total = 0;
		int n = 1;

		do {
			total += n * (n + 1);
			n++;
		} while (total < 1000); // 注意最后的分号不能丢失

		return n;
	}

	/**
	 * 使用while 循环处理： 已知 1 * 2 + 2 * 3 + 3 * 4 + ... + n * ( n + 1 ) <
	 * 1000，求n的最大值。
	 * 
	 * @return：满足条件的n的最大值
	 */
	public int testWhile() {
		int total = 0;
		int n = 1;
		while (total < 1000) {
			total += n * (n + 1);
			n++;
		}
		return n;
	}

	/**
	 * 计算任意给出的两个数之间所有数的和
	 * 
	 * @param start
	 * @param end
	 * @return : 指定范围内所有数据的和
	 */
	public int sum(int start, int end) {
		int count = 0;

		// 设置start为最小的数，end为最大的数
		int tmp;
		if (start > end) {
			tmp = end;
			end = start;
			start = tmp;
		}

		// while循环叠加
		while (start <= end) {
			count += start;
			start++;
		}

		/*
		 * // for循环叠加 for(int i = start; i <= end; i++){ count += i; }
		 */

		return count;
	}

}
