package dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {

	public List<T> findAll() throws SQLException;
	public int countAll() throws SQLException;
	public int insert(T t) throws SQLException;
	public int update(T t) throws SQLException;
	public int delete(T t) throws SQLException;
}
