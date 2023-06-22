package ua.nulp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.nulp.entity.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer>{
	
	Zone findByName(String name);
	
	boolean existsByName(String name);

}
