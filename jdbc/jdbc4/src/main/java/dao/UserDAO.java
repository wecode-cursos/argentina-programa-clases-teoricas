package dao;

import model.User;

public interface UserDAO extends GenericDAO<User> {

	public abstract User findByUsername(String username);
	
}
