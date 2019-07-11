package com.sbaek76.methods_example.eclipse;

public class methods_example {
	
	public static String[] getMembers() {
		String[] members = {"soyeon", "seungjun"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
	}
	
}
