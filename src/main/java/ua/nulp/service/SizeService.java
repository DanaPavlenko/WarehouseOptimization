package ua.nulp.service;

import java.util.List;

import ua.nulp.model.request.SizeRequest;
import ua.nulp.model.view.SizeView;

public interface SizeService {
	
	List<SizeView> findAllSizes();
	
	void save (SizeRequest request);
	
	SizeRequest findOne(Integer id);
	
	void delete (Integer id);

}
