package math;

public class Exponent extends Operator {
	public Exponent(float a, float b) {
		super(a, b);
	}

	@Override
	public float result() {
		return Math.pow(a, b);
	}
}