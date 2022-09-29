package Lambdas_Com_Lambdas;

import java.util.function.Predicate;

public class FuncaoPrecicateAndOrNegate {

	public static void main(String[] args) {
	
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<Integer> isDoisDig = n -> n> 9 & n<100 ;

		System.out.println(isPar.and(isDoisDig).test(132));
		System.out.println(isPar.negate().test(30));
		System.out.println(isPar.or(isDoisDig).test(130));
		
	}

}
