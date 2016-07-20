package br.com.step.jdbc.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		
		System.out.println(" Conectando ao banco");
	
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root","root");
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
}
