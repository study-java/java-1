package com.cdw.one;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请出入小明上一次成绩：");
		int gr1 = scanner.nextInt();
		System.out.print("请出入小明这一次成绩：");
		int gr2 = scanner.nextInt();
		double f1 = ((double)gr1)/gr2;	
		System.out.print("成绩提高的百分比为:");
		System.out.printf("%.2f%%\n",f1);
	}

}
