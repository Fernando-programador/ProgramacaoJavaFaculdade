package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {


	
	public static void main(String[] args) throws SQLException {
		//vai verificar se a conexão é segura mas não vai verificar  o certificado
		final String url = "jdbc:mysql://localhost:3306/javamysql?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "Gigi1812@";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		System.out.println("Banco de dados conectadáoç com sucesso!!!");
		conexao.close();

	}

}
