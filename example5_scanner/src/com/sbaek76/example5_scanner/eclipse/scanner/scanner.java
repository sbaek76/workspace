package com.sbaek76.example5_scanner.eclipse.scanner;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}

}
