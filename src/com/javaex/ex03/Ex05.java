package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		
		if(hour<=8) {
			System.out.println("임금은 " +hour*10000 +" 원 입니다.");
		}else {
			System.out.println("임금은 " +(hour*10000 + (hour-8)*5000) +" 원 입니다.");
		}

		sc.close();
	}
}
