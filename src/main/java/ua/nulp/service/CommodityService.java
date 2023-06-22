package ua.nulp.service;

import java.util.List;

import ua.nulp.entity.Commodity;
import ua.nulp.model.request.CommodityRequest;
import ua.nulp.model.view.CommodityView;
import ua.nulp.model.view.SizeView;

public interface CommodityService{

	List<String> findAllCategories();
	
	List<Commodity> findAll();
	
	List<SizeView> findAllSizes();
	
	List<CommodityView> findAllViews();
	
	void save(CommodityRequest request);
	
	CommodityRequest findOne(Integer id);
	
	void delete(Integer id);
	
	Commodity findByIdd(Integer id);
}
