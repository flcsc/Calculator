package math;

public class FindHyp extends Operator{

	public FindHyp(float a, float b) {
		super(a, b);
	}

	@Override
	public float result() {
		// TODO Auto-generated method stub
		return (float)Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
	}
}

