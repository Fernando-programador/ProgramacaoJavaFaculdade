package Lambdas_Com_Lambdas;

import java.util.function.UnaryOperator;

public class FuncaoUnaryOperator {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> n1 = n ->  n  * 3;
		UnaryOperator<Integer> n2 = n ->  n  + 3;
		UnaryOperator<Integer> n3 = n ->  n  + 8;
		UnaryOperator<Integer> n4 = n ->  n  + 4;
		
		int res = n1.andThen(n2).andThen(n3).andThen(n4).apply(5);

		
		System.out.println(res);
		
	}

}
