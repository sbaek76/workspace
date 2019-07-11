package com.sbaek76.example7_object.eclipse.example7_object;

//class is a set of related parameters and methods.
class Calculator{
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right){
		double PI = 3.141592;
		this.left = left;
		this.right = right;
	}
	
	public int sum() {
		return this.left + this.right;
	}
	
	public int avg() {
		return sum() / 2;
	}
}

public class example7_object {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(3,4);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
		
		Calculator c2 = new Calculator();
		c2.setOperands(8, 7);
		System.out.println(c2.sum());
		System.out.println(c2.avg());		
	
	}
	
}
