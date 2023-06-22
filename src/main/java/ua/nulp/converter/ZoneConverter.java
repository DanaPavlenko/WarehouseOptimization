package ua.nulp.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.nulp.entity.Zone;
import ua.nulp.repository.ZoneRepository;

@Component
public class ZoneConverter implements Converter<String, Zone>{
	
	private final ZoneRepository repository;

	public ZoneConverter(ZoneRepository repository) {
		this.repository = repository;
	}

	@Override
	public Zone convert(String name) {
		return repository.findByName(name);
	}

}
