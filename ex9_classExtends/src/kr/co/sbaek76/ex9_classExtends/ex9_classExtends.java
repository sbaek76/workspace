package kr.co.sbaek76.ex9_classExtends;

class Calculator{
	double left, right;
	
	public Calculator() {};
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public double add(){
		return (this.left + this.right);
	}
	
	public double sub() {
		return (this.left - this.right);
	}
	
	public double mul() {
		return (this.left * this.right);
	}
	
	public double div() {
		return (this.left / this.right);
	}
}

class Calculator2 extends Calculator {
	public Calculator2(int left, int right) {
		super(left, right);
	}
	
	public double mul() {
		System.out.println("곱의 결과는 "+(this.left * this.right));
		return this.left * this.right;
	}
	
	public double avg() {
		return (super.mul()/2);
	}
	
	public double sqrt() {
		return Math.sqrt(Math.pow(this.left, 2) + Math.pow(this.right, 2));
	}
}

public class ex9_classExtends {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2(3,4); 
		
		System.out.println(c1.avg());
		
	}
}
