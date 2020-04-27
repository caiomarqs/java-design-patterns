package br.com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryGeneric {
	
	private String tipoBanco = System.getenv("tipoBanco");
	
	public Connection getConnection() {
		
		try {
			Connection conn = null;
			
			if ("mysql".equals(tipoBanco)) {
				conn = DriverManager.getConnection("jdbc:mysql//localhost/banco", "root", "root");

			} else {
				conn = DriverManager.getConnection("jdbc:mysql//localhost/banco", "root", "root");
			}
			
			return conn;
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel conectar ao banco" + e);
		}

	}
}
