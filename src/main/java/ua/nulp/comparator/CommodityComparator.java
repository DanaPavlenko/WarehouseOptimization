package ua.nulp.comparator;

import java.util.Comparator;

import ua.nulp.entity.Commodity;

public class CommodityComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getSales().compareTo(o2.getSales());
	}
	
	

}
