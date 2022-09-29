package Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteBancoConection {

	public static void main(String[] args) {
		
		
		//selecionar SURROUND WITH  TRY\CATCH
		try {
			Connection con = Banco.criarConexao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
