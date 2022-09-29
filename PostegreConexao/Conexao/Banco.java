package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
	static final String url = "jdbc:postgresql://localhost:5432/postgres"; //indica o caminnho do banco de dados
	static final String user = "postgres"; //o nome do usuário do banco
	static final String pass = "123"; //senha de acesso ao banco
	
	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conecta = DriverManager.getConnection(url, user, pass);
		if (conecta != null) {
			System.out.println("Conexão efetuada com sucesso....");
			return conecta;
		}
		return null;
	}
}
