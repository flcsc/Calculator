package math;

public class Quotient extends Operator{

	@Override
	public float result() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public float percent() {
		return result()*100; 
	}
	
	public float getDividend() {
		return a;
	}
	
	public float getDivisor() {
		return b;
	}
}
