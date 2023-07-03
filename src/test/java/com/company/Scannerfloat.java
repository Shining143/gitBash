package com.company;

import java.util.Scanner;

public class Scannerfloat {

	public static void main(String[] args) {
		
		System.out.println("Taking number from keyboard");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		float a = sc.nextFloat();
		System.out.println("Enter second number");
		float b = sc.nextFloat();
		System.out.println("Enter third number");
		float c = sc.nextFloat();
		 float sum = a+b+c;
		 System.out.println(sum);
		 sc.close();

	}

}
