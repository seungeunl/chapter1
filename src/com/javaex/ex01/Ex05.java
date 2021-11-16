package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {

		System.out.println(2+3.4);
		
		//int var01 = 2+3.4;
		double var01 = 2+3.4;
		System.out.println(var01);
		
		//자동형변환 (long+float)
		long var02 = 12345;
		float var03 = 1.1F;
		
		System.out.println(var02+var03);
		
		
		float result = var02+var03;
		System.out.println(result);
		
		///////////////////////
		//강제 형변환
		int i = (int)11112.32323222;
		System.out.println(i);
		
		float f01 = 12.5f;
		System.out.println(f01);
		
		int i01 = (int)f01;
		System.out.println(i01);
		
		
		
	}

}
