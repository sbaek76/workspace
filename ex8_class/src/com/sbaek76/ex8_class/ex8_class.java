package com.sbaek76.ex8_class;

class C1{
	static int s = 7; //class variable
	int i = 9; //instance variable
	
	/*static void static_static() {
		System.out.println(s);
	}
	*/
	static void static_instance() {
		//System.out.println(i);
	}
	void instance_static() {
		System.out.println(s);
	}
	void instance_instance() {
		System.out.println(i);
	}
}

class C1_plus extends C1{
	void static_static() {
		//
	}
}

public class ex8_class {
	
	public static void main(String[] args) {
		C1_plus c = new C1_plus();
		
		c.static_static();
		
		
	}
	

}
