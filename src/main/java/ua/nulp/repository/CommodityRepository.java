package ua.nulp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.nulp.entity.Commodity;
import ua.nulp.model.view.CommodityView;
import ua.nulp.model.view.SizeView;

public interface CommodityRepository extends JpaRepository<Commodity, Integer>{
	
	
	Commodity findByName(String name);
	
	boolean existsByName(String name);
	
	@Query("SELECT cat.name FROM Category cat")
	List<String> findAllCategories();
	
	@Query("SELECT new ua.nulp.model.view.SizeView(s.id, s.length, s.width, s.height) FROM Size s")
	List<SizeView> findAllSizes();
	
	@Query("SELECT new ua.nulp.model.view.CommodityView(c.id, c.name, c.weight, c.count, c.sales, cat.name, s.length, s.width, s.height) FROM Commodity c JOIN Size s ON c.size=s.id JOIN Category cat ON c.category=cat.id")
	List<CommodityView> findAllViews();
	
	@Query("SELECT DISTINCT c FROM Commodity c JOIN FETCH c.category JOIN FETCH c.size WHERE c.id = ?1")
	Commodity findOneRequest(Integer id);
	
	@Query("SELECT c FROM Commodity c WHERE c.id =?1")
	Commodity findByIdd(Integer id);
	

}
