package Lambdas.ExComLambadas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FuncaoConsumer {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caderno", 19.58, 0.09);
		
		Consumer<Produto> imprimir = p -> System.out.println(p.getProduto()+ " = " + p.getPreco() + "...");
		
		imprimir.accept(p1);
		
		
		//chamando o consumer com foreach
		 
		Produto p2 = new Produto("Estojo", 30.58, 0.09);
		Produto p3 = new Produto("Lapis", 3.08, 0.09);
		Produto p4 = new Produto("Borracha", 1.00, 0.09);
		Produto p5 = new Produto("Caneta", 3.25, 0.09);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimir );
	}

}
