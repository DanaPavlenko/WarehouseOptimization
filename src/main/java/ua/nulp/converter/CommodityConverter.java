package ua.nulp.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.nulp.entity.Commodity;
import ua.nulp.repository.CommodityRepository;

@Component
public class CommodityConverter implements Converter<String, Commodity>{
	
	private final CommodityRepository repository;

	public CommodityConverter(CommodityRepository repository) {
		this.repository = repository;
	}

	@Override
	public Commodity convert(String name) {
		return repository.findByName(name);
	}
}
