package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	
	public static void main(String[] args) throws SQLException{
		String nome, sql;

	Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		nome = sc.nextLine(); 
		
		Connection conexao = FabricaConexao.getConnection();		

		sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();

		System.out.println("Inserção com Sucesso");
		sc.close();
	}

}
