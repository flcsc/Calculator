package math;

/**
 * The {@code Exponent} class represents a number (or "base") raised to a certain exponent (or "power").
 */
public class Exponent extends Operator {
	/**
	 * Constructs a new {@code Exponent} object with the specified base and exponent.
	 * 
	 * @param base     Specified base
	 * @param exponent Specified exponent
	 */
	public Exponent(float base, float exponent) {
		super(base, exponent);
	}

	/**
	 * Returns the base of the {@code Exponent} object.
	 * 
	 * @return {@code Exponent} base
	 */
	public float getBase() {
		return super.a;
	}

	/**
	 * Returns the exponent of the {@code Exponent} object.
	 * 
	 * @return {@code Exponent} exponent
	 */
	public float getExponent() {
		return super.b;
	}

	/**
	 * Returns the value of the base raised to the specified exponent.
	 * 
	 * @return Base raised to specified exponent
	 */
	@Override
	public float result() {
		return (float)Math.pow(super.a, super.b);
	}
}