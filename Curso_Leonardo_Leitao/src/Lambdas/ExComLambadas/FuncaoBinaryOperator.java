package Lambdas.ExComLambadas;

import java.util.function.BinaryOperator;

public class FuncaoBinaryOperator {
	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
		//verificar function
		
		BinaryOperator<Double> calc = (a, b) -> {return  a + b; };
		System.out.println(calc.apply(2.0,3.0));

		BinaryOperator<Integer> calc2 = (a, b) -> {return  a * b; };
		System.out.println(calc2.apply(7,3));
	}
}
