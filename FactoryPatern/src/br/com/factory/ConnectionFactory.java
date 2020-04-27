package br.com.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getMySqlConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql//localhost/banco", "root", "root");
			return conn; 
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel conectar ao banco"+ e);
		}
		
	}
	
	public Connection getOracleConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle//localhost/banco", "root", "123456");
			return conn; 
		} catch (SQLException e) {
			throw new RuntimeException("Não foi possivel conectar ao banco" + e);
		}
		
	}
}
