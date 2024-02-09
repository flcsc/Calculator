package math;

/**
 * The {@code Product} class represents the product between two numbers.
 */
public class Product extends Operator {
	/**
	 * Constructs a new {@code Product} object with the specified numbers.
	 * 
	 * @param num1     First specified number
	 * @param num2     Second specified number
	 */
	public Product(float num1, float num2) {
		super(num1, num2);
	}

	/**
	 * Returns the first number of the {@code Product} object.
	 * 
	 * @return {@code Product} first number
	 */
	public float getFirstNumber() {
		return super.a;
	}

	/**
	 * Returns the second number of the {@code Product} object.
	 * 
	 * @return {@code Product} second number
	 */
	public float getSecondNumber() {
		return super.b;
	}

	/**
	 * Returns the value of the product of the two numbers.
	 * 
	 * @return Product of the two numbers
	 */
	@Override
	public float result() {
		return (float)super.a * super.b;
	}
}