package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		double v01 = 5/4;
		System.out.println(v01);
		// 5/4는 몫 --> 1을 double에 담으니까 1.0이 됨
		
		
		double v02 = (double)5/4;
		System.out.println(v02);
		// 5.0을 4로 나누기 --> 5.0을 4.0으로 나누기 (실수하고 정수하고 싸우면 실수가 이김)
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		//5를 4.0으로 나누기 --> 5.0/4.0 -->1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04);
		// 5.0/4.0 --> 1.25
		
		int v05 = (int)1.3 + (int) 1.8;
		System.out.println(v05);
		// 1 + 1 --> 2
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		// (int)3.1 --> 3  
	}

}
