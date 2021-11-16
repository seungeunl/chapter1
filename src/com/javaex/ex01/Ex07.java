package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		//산술연사자 / % 자세히
		System.out.println("산술연산자");
		System.out.println(7.0/2.0); //3.5
		System.out.println(7.0%2.0); //실수도 나머지는 꼭 구해줌
		
		
		// 부호연산자
		int var = -3;
		int pVar = +var;
		System.out.println(pVar);
		int mVar = -var;
		
		System.out.println(pVar); //+(-3)
		System.out.println(mVar); //-(-3)
		
		
		//증강연산자
		System.out.println("증강연산자");
		System.out.println(a); //7
		System.out.println(++a); //(1)a를 1 올린다. (2)a를 출력한다.
		System.out.println(a); //a 메모리에 든 값 원본 자체가 변함.
		
		System.out.println(b);
		System.out.println(--b); // b를 1 내린다. b를 출력한다.
		System.out.println(b);
		
		System.out.println(a); //8
		System.out.println(a++); // (1)a를 출력한다. (2)a를 1 올린다.
		System.out.println(a);
		
		System.out.println(b); //1
		System.out.println(b--); // (1)b를 출력한다. (2)b를 1 내린다.
		System.out.println(b);
		
		
	}
}
