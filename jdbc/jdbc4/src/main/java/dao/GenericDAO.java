package dao;

import java.util.List;

public interface GenericDAO<T> {

	public List<T> findAll();
	public int countAll();
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
}
