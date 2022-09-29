package Lambdas_Sem_Lambdas;

public class appCalculo {
	public static void main(String[] args) {

		
		
		
		 Calculo soma = new Soma();
		 System.out.println(soma.executar(5, 8));
		 
		 
		 Calculo multiplicar  = new Multiplicar();
		 System.out.println(multiplicar.executar(5, 8));
	}
}
