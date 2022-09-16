package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConnection() {
		
		try {
			final String url = "jdbc:mysql://localhost/javamysql?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "Gigi1812@";	
			
			

			return  DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		

		
		
	}
	
	
}
