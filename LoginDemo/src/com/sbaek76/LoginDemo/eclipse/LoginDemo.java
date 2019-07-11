package com.sbaek76.LoginDemo.eclipse;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];
		if(id.equals("sbaek76")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}
