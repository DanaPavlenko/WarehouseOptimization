package ua.nulp.algorithm.realization;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ua.nulp.algorithm.Algorithm;
import ua.nulp.entity.Block;
import ua.nulp.entity.Commodity;
import ua.nulp.model.request.BlockRequest;
import ua.nulp.model.request.CommodityRequest;
import ua.nulp.service.BlockService;
import ua.nulp.service.CommodityService;

public class SimpleSolver implements Algorithm{

	private final CommodityService cService;
	private final BlockService bService;

	public SimpleSolver(CommodityService cService, BlockService bService) {
		this.cService = cService;
		this.bService = bService;
	}

	Comparator<Commodity> bySales = (Commodity o1, Commodity o2) -> o1.getSales().compareTo(o2.getSales());

	Comparator<Block> byName = (Block o1, Block o2) -> o1.getName().compareTo(o2.getName());

	private List<Commodity> sortCommodities() {
		List<Commodity> commodities = cService.findAll();
		Collections.sort(commodities, bySales);
		return commodities;

	}
	
	private List<Block> sortBlocks() {
		List<Block> blocks = bService.findAll();
		Collections.sort(blocks, byName);
		return blocks;
	}
	
	private void locate(List<Commodity> commodities , List<Block> blocks){
		Integer blockIndex = 0;
		for (int i = 0; i < commodities.size(); i++) {
			
			BlockRequest block = bService.findOne(blocks.get(blockIndex).getId());
			CommodityRequest commodity = cService.findOne(commodities.get(i).getId());
			for ( int j = 0; j<blockCount(block, commodity) ; j++) {
				BlockRequest block1 = bService.findOne(blocks.get(blockIndex).getId());
				block1.setCommodity(cService.findByIdd(commodities.get(i).getId()));
				bService.save(block1);
				blockIndex++;
		}
		}
	}
	
	public void locateCommodities(){
		List<Commodity> commodities = sortCommodities();
		List<Block> blocks = sortBlocks();
		locate(commodities, blocks);
	}
	
	private Integer blockCount(BlockRequest block, CommodityRequest commodity){
		Integer lenCount = block.getSize().getLength()/commodity.getSize().getLength();
		Integer widthCount = block.getSize().getWidth()/commodity.getSize().getWidth();
		Integer heightCount = block.getSize().getHeight()/commodity.getSize().getHeight();
		return Math.min(lenCount, Math.min(widthCount, heightCount));
	}
	
}

