package Lambdas.ExComLambadas;

public class appCalculo {
	public static void main(String[] args) {

		
		
		
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(7, 8));

		calc = (x, y) -> x * y;
		System.out.println(calc.executar(7, 8));

	}
}
