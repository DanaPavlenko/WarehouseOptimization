package ua.nulp.service.impl;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.nulp.entity.Commodity;
import ua.nulp.model.request.CommodityRequest;
import ua.nulp.model.view.CommodityView;
import ua.nulp.model.view.SizeView;
import ua.nulp.repository.CommodityRepository;
import ua.nulp.service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService{

	private final CommodityRepository repository;

	@Autowired
	public CommodityServiceImpl(CommodityRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<String> findAllCategories() {
		return repository.findAllCategories();
	}

	@Override
	public List<SizeView> findAllSizes() {
		return repository.findAllSizes();
	}

	@Override
	public List<CommodityView> findAllViews() {
		return repository.findAllViews();
	}
	
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void save(CommodityRequest request) {
		Commodity commodity = new Commodity();
		commodity.setCategory(request.getCategory());
		commodity.setCount(Integer.valueOf(request.getCount()));
		commodity.setId(request.getId());
		commodity.setName(request.getName());
		commodity.setSales(new BigDecimal(request.getSales()));
		commodity.setSize(request.getSize());
		commodity.setWeight(Integer.valueOf(request.getWeight()));
		repository.save(commodity);
	}

	@Override
	public CommodityRequest findOne(Integer id) {
        Commodity commodity = repository.findOneRequest(id);
        CommodityRequest request = new CommodityRequest();
        request.setCategory(commodity.getCategory());
        request.setCount(String.valueOf(commodity.getCount()));
        request.setId(commodity.getId());
        request.setName(commodity.getName());
        request.setSales(String.valueOf(commodity.getSales()));
        request.setSize(commodity.getSize());
        request.setWeight(String.valueOf(commodity.getWeight()));
		return request;
	}

	@Override
	public List<Commodity> findAll() {
		return repository.findAll();
	}

	@Override
	public Commodity findByIdd(Integer id) {
		return repository.findByIdd(id);
	}
	
	
	
	

}
