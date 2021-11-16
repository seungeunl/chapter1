package com.javaex.ex01;

public class Ex03 {

	
		public static void main(String[] args) {
			char ch01 = 'A';
			System.out.println(ch01);
			// char은 한 글자만 가능
			
			char ch02 = 65;
			System.out.println(ch02);
			// char 뒤에 정수를 넣으면 코드갑에 대응하는 문자가 출력됨.
			
			boolean b01 = true; //true 와 false는 문자 아니고 기능 있는 단어임 
			boolean	b02 = false;
			
			System.out.println(b01);
			System.out.println(b02);
			
			int a = 3;
			int b = 5;
			boolean result = a>b;
			System.out.println(result);
			
			String str = "안녕하세요"; // 문자열 String은 쌍따옴표(한글자만 넣더라도). 문자 하나 char은 작은 따옴표
			System.out.println(str);
		}
}
