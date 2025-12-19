package com.kh.first;

import java.util.Scanner;

public class Practice2 {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수 : ");
	int num1 = sc.nextInt();
	System.out.print("두번째 정수 : ");
	int num2 = sc.nextInt();
	
	System.out.print("더하기 : 237" + (num1 + num2));
	System.out.print("빼기 : " + (num1 - num2));
	System.out.print("곱하기 : " + num1 * num2);
	System.out.print("나누기 : " + num1 / num2);
}


public void practice3() {
	Scanner sc =new Scanner(System.in);
	System.out.print("가로");
	double width = sc.nextDouble();
	
	System.out.print("세로");
	double height = sc.nextDouble();
	
	System.out.println("면적 : " + width * height);
	System.out.println("둘레 : " +(width * height));
}

public void practice4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열 입력 : ");
	String str = sc.next();
	
	System.out.println("첫번째 문자 : " +str.charAt(0));
	System.out.println("두번째 문자 : " +str.charAt(1));
	System.out.println("세번째 문자 : " +str.charAt(2));
}
