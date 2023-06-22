package ua.nulp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.nulp.entity.Block;
import ua.nulp.model.request.BlockRequest;
import ua.nulp.model.view.BlockView;
import ua.nulp.model.view.OrderedView;
import ua.nulp.model.view.SizeView;
import ua.nulp.repository.BlockRepository;
import ua.nulp.service.BlockService;

@Service
public class BlockServiceImpl  implements BlockService {

	private final BlockRepository repository;
	
	@Autowired
	public BlockServiceImpl(BlockRepository repository) {
		this.repository = repository;
	}


	@Override
	public List<String> findAllCommodities() {
		return repository.findAllCommodities();
	}


	@Override
	public List<String> findAllZones() {
		return repository.findAllZones();
	}


	@Override
	public List<SizeView> findAllSizes() {
		return repository.findAllSizes();
	}


	@Override
	public List<BlockView> findAllViews() {
		return repository.findAllViews();
	}


	


	@Override
	public void delete(Integer id) {
		repository.deleteById(id);	
	}


	@Override
	public void save(BlockRequest request) {
		Block block = new Block();
		block.setCommodity(request.getCommodity());
		block.setId(request.getId());
		block.setName(request.getName());
		block.setSize(request.getSize());
		block.setZone(request.getZone());
		repository.save(block);
		
	}


	@Override
	public BlockRequest findOne(Integer id) {
		Block block = repository.findOneRequest(id);
		BlockRequest request = new BlockRequest();
		request.setCommodity(block.getCommodity());
		request.setId(block.getId());
		request.setName(block.getName());
		request.setSize(block.getSize());
		request.setZone(block.getZone());
		return request;
	}


	@Override
	public Block findByCommodityName(String name) {
		return repository.findByCommodityName(name);
	}


	@Override
	public List<Block> findAll() {
		return repository.findAll();
	}


	/*@Override
	public void updateBlock(Integer commodityId, Integer id) {
		repository.updateBlock(commodityId, id);
	}
*/

	@Override
	public List<OrderedView> selectOrdered() {
		return repository.selectOrdered();
	}


	@Override
	public void flush() {
repository.flush();		
	}

	
}
