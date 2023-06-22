package ua.nulp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.nulp.entity.Size;
import ua.nulp.model.request.SizeRequest;
import ua.nulp.model.view.SizeView;
import ua.nulp.repository.SizeRepository;
import ua.nulp.service.SizeService;

@Service
public class SizeServiceImpl implements SizeService {

	private final SizeRepository repsitory;

	public SizeServiceImpl(SizeRepository repsitory) {
		this.repsitory = repsitory;
	}

	@Override
	public List<SizeView> findAllSizes() {
		return repsitory.findAllViews();
	}

	@Override
	public void delete(Integer id) {
		repsitory.deleteById(id);

	}

	@Override
	public void save(SizeRequest request) {
		Size size = new Size();
		size.setHeight(Integer.valueOf(request.getHeight()));
		size.setId(request.getId());
		size.setLength(Integer.valueOf(request.getLength()));
		size.setWidth(Integer.valueOf(request.getWidth()));
		repsitory.save(size);

	}

	@Override
	public SizeRequest findOne(Integer id) {
		Size size = repsitory.findOneRequest(id);
		SizeRequest request = new SizeRequest();
		request.setHeight(String.valueOf(size.getHeight()));
		request.setId(size.getId());
		request.setLength(String.valueOf(size.getLength()));
		request.setWidth(String.valueOf(size.getWidth()));
		return request;
	}

}
