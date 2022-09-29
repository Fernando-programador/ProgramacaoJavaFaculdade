package Lambdas_Com_Lambdas;

import java.util.function.BiFunction;

public class FuncaoBiFunction {

	public static void main(String[] args) {
		
		
		BiFunction<Double, Double, String> media = (Double n1, Double n2) -> {
			double res = (n1 + n2)/2;
			return res >= 7 ? "Aprovado"  : "Reprovado";
		};
		System.out.println(media.apply(6.2, 9.2));
		
		
		
		
		
		

	}

}
