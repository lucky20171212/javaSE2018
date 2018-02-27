package com.javase.lesson.staticFlag;

public class TestCount {

	public static void main(String[] args) {
		// 实例化时加载静态代码
		Count count = new Count();
		
		count.prt("count.v.c = " + count.v.c );
		System.out.println("");
		
		count.prt("Count.v1.c = " + Count.v1.c + " , Count.v2.c = " + Count.v2.c);
		System.out.println("");
		
		count.v1.inc();
		
		count.prt("Count.v1.c = " + Count.v1.c + " , Count.v2.c = " + Count.v2.c);
		System.out.println("");
		
		count.prt("count.v.c = " + count.v.c );
	}
}
