package Lambdas.ExComLambadas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		/**
		 * calcular o preço real com desconto imposto municipal: >= 2500(8.5%) / <
		 * 2500(Isento) frete: >= 3000(100) / < 3000 (50) arredondar para duas casas
		 * formatar 12345,56
		 */

		Function<Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desc);
	//	UnaryOperator<Double> imp = valor -> valor >= 2500 ? valor * 1.085 : valor;
//		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
	//	UnaryOperator<Double> arren = valor ->
	//	Double.parseDouble(String.format("%.2f", valor));
		Function<Double, String> fmt = valor -> ("R$ " + valor).replace(".", ",");

		Produto prod = new Produto("Mac", 3255.89, 0.13);
		//String valor = precoFinal.andThen(imp).andThen(frete).andThen(arren).andThen(fmt).apply(prod);

		System.out.println(precoFinal);
		//System.out.println("O preco final eh " + valor);

	}

}
