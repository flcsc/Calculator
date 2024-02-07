package math;

public abstract class Operator {
	float a, b;
	
	public Operator(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract float result();
}
