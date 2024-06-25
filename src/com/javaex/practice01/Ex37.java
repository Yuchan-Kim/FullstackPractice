package com.javaex.practice01;

import java.util.Scanner;

public class Ex37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("전체 연필갯수를 입력해주세요: ");
		int numOfPen = sc.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		int numOfPerson = sc.nextInt();
		
		int penPerPerson = numOfPen / numOfPerson;
		int extra = numOfPen % numOfPerson;
		System.out.println("1인당 연필의 갯수는 " + penPerPerson + "입니다.");
		System.out.println("연필의 나머지 갯수는  " + extra + "입니다.");
		sc.close();   
	}
}