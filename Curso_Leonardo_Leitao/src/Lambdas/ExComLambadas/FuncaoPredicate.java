package Lambdas.ExComLambadas;

import java.util.function.Predicate;

public class FuncaoPredicate {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desc)) >= 1000;

		Produto produto = new Produto("notebook", 3500, 0.15);

		System.out.println(isCaro.test(produto));

	}

}
