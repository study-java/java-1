package com.cdw.one;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����С����һ�γɼ���");
		int gr1 = scanner.nextInt();
		System.out.print("�����С����һ�γɼ���");
		int gr2 = scanner.nextInt();
		double f1 = ((double)gr1)/gr2;	
		System.out.print("�ɼ���ߵİٷֱ�Ϊ:");
		System.out.printf("%.2f%%\n",f1);
	}

}
