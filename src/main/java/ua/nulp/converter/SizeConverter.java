package ua.nulp.converter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.nulp.entity.Size;
import ua.nulp.repository.SizeRepository;

@Component
public class SizeConverter implements Converter<Integer, Size>{
	
	private final SizeRepository repository;
	
	
   @Autowired
	public SizeConverter(SizeRepository repository) {
		this.repository = repository;
	}

	@Override
	public Size convert(Integer id) {
		return repository.findByIdd(id);
	}
	
	
	
	

}
