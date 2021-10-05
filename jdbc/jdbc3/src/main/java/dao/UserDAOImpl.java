package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.User;

public class UserDAOImpl implements UserDAO {

	public int insert(User user) throws SQLException {
		String sql = "INSERT INTO USERS (USERNAME, PASSWORD) VALUES (?, ?)";
		Connection conn = ConnectionProvider.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, user.getUsername());
		statement.setString(2, user.getPassword());
		int rows = statement.executeUpdate();

		return rows;
	}
	
	public int update(User user) throws SQLException {
		String sql = "UPDATE USERS SET PASSWORD = ? WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, user.getPassword());
		statement.setString(2, user.getUsername());
		int rows = statement.executeUpdate();

		return rows;
	}
	
	public int delete(User user) throws SQLException {
		String sql = "DELETE FROM USERS WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConnection();

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, user.getUsername());
		int rows = statement.executeUpdate();

		return rows;
	}

	public User findByUsername(String username) throws SQLException {
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, username);
		ResultSet resultados = statement.executeQuery();

		User user = null;
		
		if (resultados.next()) {
			user = toUser(resultados);
		}
		
		return user;
	}

	public int countAll() throws SQLException {
		String sql = "SELECT COUNT(1) AS TOTAL FROM USERS";
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultados = statement.executeQuery();

		resultados.next();
		int total = resultados.getInt("TOTAL");

		return total;
	}

	public List<User> findAll() throws SQLException {
		String sql = "SELECT * FROM USERS";
		Connection conn = ConnectionProvider.getConnection();
		PreparedStatement statement = conn.prepareStatement(sql);
		ResultSet resultados = statement.executeQuery();

		List<User> usuarios = new LinkedList<User>();
		while (resultados.next()) {
			usuarios.add(toUser(resultados));
		}

		return usuarios;
	}

	private User toUser(ResultSet resultados) throws SQLException {
		return new User(resultados.getString(1), resultados.getString(2));
	}

}
