package ua.nulp.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.nulp.entity.Zone;

@Component
public class StringZoneConverter implements Converter<Zone, String>{

	@Override
	public String convert(Zone zone) {
		return zone.getName();
	}

}
