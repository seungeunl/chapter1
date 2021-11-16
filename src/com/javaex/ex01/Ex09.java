package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 &&
		System.out.println(true&&true);
		
		//논리연산자 응용
		System.out.println( (a>b)&&(a<b) );
		System.out.println( (a>b)&&(a>b) );
		
		System.out.println("|| 연산자 응용");
		System.out.println( (a>b) || (a<b) );

		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println( !(a>b) );
		
		System.out.println("버전 2");
		System.out.println("버전 3");
		
	}
}
