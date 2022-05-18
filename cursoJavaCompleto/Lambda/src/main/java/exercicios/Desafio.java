package exercicios;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
	
		
		
	 /*
	 * 1. a partir do produto calcular o preco real (com desconto)
	 * 2. imposto municipal: >= 2500(8,5%) / <2500(isento)
	 * 3. frete: >= 3000 (100) / <3000 (50)
	 * 4. arredondar: deixar duas casas decimais
	 * 5. formatar: R$1234,56
	 */

		
		Function<Produto, Double> precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete =
				frete -> frete >= 3000 ? frete + 100 : frete + 50;
		UnaryOperator<Double> arredondar=
				preco -> String.format("%.2f", preco);
		Function<Double, String> formatar=
				preco -> ("R$" + preco).replace(".",",");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		String preco  = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.aplly(p);
		
		System.out.println("O preço final é " + preco);
		
		
		
		
	}

}
