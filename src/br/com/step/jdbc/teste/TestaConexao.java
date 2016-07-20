package br.com.step.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.step.jdbc.Factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = new ConnectionFactory().getConnection();
	
		con.close();
	}

}
