package kr.co.sbaek76.ex11_abstract;


abstract class Abs{
	public abstract int a();
}

class B extends Abs {
	public final int c = 12;

	@Override
	public int a() {
		// TODO Auto-generated method stub
		System.out.println("success.");
		return 0;
	}
	
	public void changeC() {
		this.c = 11;
		System.out.println(c);
	}
}

public class ex11_abstract {
	public static void main(String[] args) {
		B b = new B();
		b.a();
		
		b.changeC();
	}
}
