package kr.co.sbaek76.ex10_amazingcalc;

class Calc {
	double[] operands;
	
	public Calc() {}
	
	public Calc(double[] operands) {
		this.operands = operands;
	}
	
	public void setOperands(double[] operands) {
		this.operands = operands;
	}
	
	public void show() {
		for (double value: this.operands) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	public double sum() {
		double total = 0;
		for(double value : this.operands) {
			total = total + value;
		}
		return total;
	}
	
	public double avg() {
		return this.sum() / this.operands.length;
	}
}

public class ex10_amazingcalc {
	public static void main(String[] args) {
		Calc c = new Calc(new double[]{1, 4, 3, 4});
		c.show();
		System.out.println("sum: "+c.sum());
		System.out.println("avg: "+c.avg());
	}
}
