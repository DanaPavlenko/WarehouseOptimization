package ua.nulp.service;

import java.io.Serializable;
import java.util.List;

public interface CrudService <T, ID extends Serializable> {
	
	public List<T> findAll();
	
	public T find(ID id);
	
	public void delete (ID id);
	
	public void save (T entity);
}