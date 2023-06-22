package ua.nulp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.nulp.entity.Size;
import ua.nulp.model.view.SizeView;

public interface SizeRepository extends JpaRepository<Size, Integer>{
	
	@Query("SELECT new ua.nulp.model.view.SizeView(s.id, s.length, s.width, s.height) FROM Size s")
	List<SizeView> findAllViews();
	
	@Query("FROM Size WHERE id = ?1")
	Size findByIdd(Integer id);
	
	@Query("SELECT DISTINCT s FROM Size s WHERE s.id = ?1")
	Size findOneRequest(Integer id);
	
	@Query("SELECT s.id FROM Size s WHERE s.length= ?1")
	Integer findId(Integer length);

}
