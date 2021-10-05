package dao;

import java.sql.SQLException;

import model.User;

public interface UserDAO extends GenericDAO<User> {

	public abstract User findByUsername(String username) throws SQLException;
	
}
