package math;

/**
 * The {@code NthRoot} class represents the specified nth-root of a number (or "base").
 * <p>
 * Some examples of nth-roots are the square-root (second root), cube-root (third root) and fourth root.
 */
public class NthRoot extends Operator {
	/**
	 * Constructs a new {@code NthRoot} object with the specified base and nth-root.
	 * 
	 * @param base    Specified base
	 * @param nthRoot Specified nth-root
	 */
	public NthRoot(float base, float nthRoot) {
		super(base, nthRoot);
	}

	/**
	 * Returns the base of the {@code NthRoot} object.
	 * 
	 * @return {@code NthRoot} base
	 */
	public float getBase() {
		return super.a;
	}

	/**
	 * Returns the nth-root of the {@code NthRoot} object.
	 * 
	 * @return {@code NthRoot} nth-root
	 */
	public float getNthRoot() {
		return super.b;
	}

	/**
	 * Returns the value of the specified nth-root of the base.
	 * 
	 * @return Specified nth-root of base
	 */
	@Override
	public float result() {
		return (float)Math.pow(super.a, 1 / super.b);
	}
}