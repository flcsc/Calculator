package math;

public class NthRoot extends Operator {
    public NthRoot(float a, float b) {
        super(a, b);
    }

    @Override
    public float result() {
        return Math.pow(a, 1/b);
    }
}
