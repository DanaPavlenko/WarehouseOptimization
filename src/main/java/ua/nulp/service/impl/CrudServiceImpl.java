package ua.nulp.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.nulp.service.CrudService;

public class CrudServiceImpl <T, ID extends Serializable> implements CrudService<T, ID>{
	
	private final JpaRepository<T, ID> repository;

	public CrudServiceImpl(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public T find(ID id) {
		return repository.getOne(id);
	}

	@Override
	public void delete(ID id) {
		repository.deleteById(id);
		
	}

	@Override
	public void save(T entity) {
		repository.save(entity);
		
	}
	
	

}
