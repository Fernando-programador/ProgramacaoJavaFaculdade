package Lambdas.ExComLambadas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FuncaoSupllier {

	public static void main(String[] args) {
		
		Supplier<List<String>> lista = () -> Arrays.asList("Fer", "Gigi", "Sola", "Theo");
				System.out.println(lista.get());
	}

}
