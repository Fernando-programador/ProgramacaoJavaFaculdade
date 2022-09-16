package Lambdas.ExComLambadas;

import java.util.function.Function;

public class FuncaoFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, String> parImpar = n1 -> n1 % 2 == 0 ? "Numero Par" : "Numero Impar";
		
		System.out.println(parImpar.apply(10));
		
		Function<String, String> res = valor -> valor + "!!!";
		
		String resFinal = parImpar.andThen(res).apply(32);
		
		
		System.out.println(resFinal);
		
		
	}

}
