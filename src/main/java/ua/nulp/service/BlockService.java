package ua.nulp.service;

import java.util.List;

import ua.nulp.entity.Block;
import ua.nulp.model.request.BlockRequest;
import ua.nulp.model.view.BlockView;
import ua.nulp.model.view.OrderedView;
import ua.nulp.model.view.SizeView;

public interface BlockService {
	
	List<Block> findAll();
	
	List<String> findAllCommodities();
	
	List<String> findAllZones();
	
	List<SizeView> findAllSizes();
	
	List<BlockView> findAllViews();
	
	void save (BlockRequest block);
	
	BlockRequest findOne(Integer id);
	
	void delete (Integer id);
	
	Block findByCommodityName(String name);
	
//	void updateBlock(Integer commodityId, Integer id);
	
	List<OrderedView> selectOrdered();
	
	void flush();
}
