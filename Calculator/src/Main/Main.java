package Main;

import math.Exponent;
import math.NthRoot;
import math.Product;
import math.Sum;

public class Main {
	public static void main(String[] args) {
		// Testing Sum class
		Sum sum = new Sum(13, 5);
		System.out.print("Sum of 13 and 5: ");
		System.out.println(sum.result());
		// Testing Product class
		Product product = new Product(6, 8);
		System.out.print("Product of " + product.getFirstNumber() + " and " + product.getSecondNumber() + ": ");
		System.out.println(product.result());
		// Testing Exponent class
		Exponent exp = new Exponent(2, 3);
		System.out.print(exp.getBase() + " to exponent " + exp.getExponent() + ": ");
		System.out.println(exp.result());
		// Testing NthRoot class
		NthRoot nRoot = new NthRoot(16, 4);
		System.out.print("Root " + nRoot.getNthRoot() + " of " + nRoot.getBase() + ": ");
		System.out.println(nRoot.result());
	}
}
