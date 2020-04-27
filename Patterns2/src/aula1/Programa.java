package aula1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
	public static void main(String[] args) throws SQLException {
		
		Connection conn  = new ConnectionFactory().getMySqlConnection();
		
		PreparedStatement ps = conn.prepareStatement("Select * from");
		ps.execute();
	}
}
