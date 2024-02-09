package math;

public class Difference extends Operator{

	public Difference(float a, float b) {
		super(a, b);
	}

	@Override
	public float result() {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	/**
	 * input: No input required	
	 * @return number that is being subtracted by the other number
	 */
	public float getMinuend() {
		return a;
	}
	/**
	 * 
	 * @return number to be subtracted from the other number
	 */
	public float getSubtrahend() {
		return b;
	}

}
