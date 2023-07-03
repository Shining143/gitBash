package com.company;

import java.util.Scanner;

public class Scannerint {

	public static void main(String[] args) {
		
		System.out.println("Taking number from keyboard");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter third number");
		int c = sc.nextInt();
		 int sum = a+b+c;
		 System.out.println(sum);
		 sc.close();
		
		
		
	}

}
