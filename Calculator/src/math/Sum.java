package math;

public class Sum extends Operator {
	
	public Sum(float a, float b) {
		super(a, b);	
	}
	
	@Override
	public float result() {
		return a + b;
	}

}
