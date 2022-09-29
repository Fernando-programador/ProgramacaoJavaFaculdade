package Lambdas_Com_Lambdas;

import java.util.Arrays;
import java.util.List;

public class forEach {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("aluno1", "aluno2", "aluno3", "aluno4");

		System.out.println("Forma tradicional Foreach");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda 01#");
		aprovados.forEach((nome) -> {
			System.out.println(nome + "???");
		});

		System.out.println("\nMethod references...");
		aprovados.forEach(System.out::println);

		// metodo personalizado
		System.out.println("\nLambda 02#");
		aprovados.forEach((nome) -> imprimir(nome));

		System.out.println("\nMethod references 2#...");
		aprovados.forEach(forEach::imprimir);

	}
	static void imprimir (String nome) {
		System.out.println("Oi meu nome éh " + nome);
	}

}
