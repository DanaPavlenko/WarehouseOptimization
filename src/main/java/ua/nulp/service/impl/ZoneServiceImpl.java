package ua.nulp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.nulp.entity.Zone;
import ua.nulp.repository.ZoneRepository;
import ua.nulp.service.ZoneService;

@Service
public class ZoneServiceImpl extends CrudServiceImpl<Zone, Integer> implements ZoneService{

	@Autowired
	public ZoneServiceImpl(ZoneRepository repository) {
		super(repository);
	}
	
	

}
