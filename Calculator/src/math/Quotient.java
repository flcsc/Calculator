package math;

public class Quotient extends Operator{

	public Quotient(float a, float b) {
		super(a,b);
	}

	@Override
	public float result() {
		// TODO Auto-generated method stub
		return a/b;
	}
}
