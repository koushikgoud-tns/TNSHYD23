package com.approach1;

public class Mainclass {
	int a=10;
	static String b="dhoni";
	int sample1() {
		return 11;
	}
	static String sample2() {
		return"raina";
	
	}
	public static void main(String[] args) {
		Mainclass m1=new Mainclass();
		System.out.println(m1.a);
		System.out.println(m1.sample1());
		System.out.println(Mainclass.b);
		System.out.println(Mainclass.sample2());
		
	}
	
			

}
