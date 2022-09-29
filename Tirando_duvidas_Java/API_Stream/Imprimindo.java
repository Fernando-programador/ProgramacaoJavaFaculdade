package API_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Imprimindo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> aprovados = Arrays.asList("Aluno1","Aluno2","Aluno3","Aluno4","Aluno5" );
		
		System.out.println("Tradicional...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));		
		}
		
		System.out.println("\nForeach...");
		for (String nome : aprovados) {
			System.out.println(nome);		
			
		}
		System.out.println("\nIterator...");
		 Iterator<String> it = aprovados.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }

		 
		 System.out.println("\nStream...");
		 
	
		 
	}

}
