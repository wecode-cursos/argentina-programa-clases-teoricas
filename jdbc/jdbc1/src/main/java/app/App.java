package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlite:users.db";
		Connection connection = DriverManager.getConnection(url);

		String sql = "SELECT COUNT(1) AS TOTAL FROM USERS";
		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultados = statement.executeQuery();
		
		resultados.next();
		System.out.println(resultados.getInt("TOTAL"));

		connection.close();
	}
}
