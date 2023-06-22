package ua.nulp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.nulp.entity.Block;
import ua.nulp.model.view.BlockView;
import ua.nulp.model.view.OrderedView;
import ua.nulp.model.view.SizeView;

public interface BlockRepository extends JpaRepository<Block, Integer>{
	
	@Query("SELECT COUNT(b)>0 from Block b WHERE b.name = :name")
	boolean existsByName(@Param(value = "name") String name);
	
	@Query("SELECT new ua.nulp.model.view.SizeView(s.id, s.length, s.width, s.height) FROM Size s")
	List<SizeView> findAllSizes();
	
	@Query("SELECT z.name FROM Zone z")
	List<String> findAllZones();

	@Query("SELECT c.name FROM Commodity c")
	List<String> findAllCommodities();
	
	@Query("SELECT new ua.nulp.model.view.BlockView(b.id, b.name, s.length, s.width, s.height, c.name, z.name) FROM Block b JOIN Size s ON b.size = s.id JOIN Commodity c ON b.commodity=c.id JOIN Zone z ON b.zone = z.id")
	List<BlockView> findAllViews();
	
	@Query("SELECT DISTINCT b FROM Block b JOIN FETCH b.size JOIN FETCH b.zone JOIN FETCH b.commodity WHERE b.id=?1")
	Block findOneRequest(Integer id);
	
	@Query("SELECT b FROM Block b JOIN Commodity c ON b.commodity=c.name WHERE c.name=?1")
	Block findByCommodityName(String name);
	
	@Query("SELECT new ua.nulp.model.view.OrderedView(b.name, c.name) FROM Block b JOIN Commodity c ON b.commodity = c.id")
	List<OrderedView> selectOrdered();
	
}
