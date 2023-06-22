package ua.nulp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.nulp.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category findByName(String name);
	
	boolean existsByName(String name);
}
