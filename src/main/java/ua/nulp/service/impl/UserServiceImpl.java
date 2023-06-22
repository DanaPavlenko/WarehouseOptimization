package ua.nulp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ua.nulp.entity.Role;
import ua.nulp.entity.User;
import ua.nulp.model.request.RegistrationRequest;
import ua.nulp.repository.UserRepository;
import ua.nulp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;
	
	private final PasswordEncoder encoder;

	@Autowired
	public UserServiceImpl(UserRepository repository, PasswordEncoder encoder) {
		this.repository = repository;
		this.encoder = encoder;
	}

	@Override
	public void save(RegistrationRequest request) {
		User user = new User();
		user.setLogin(request.getEmail());
		user.setPassword(encoder.encode(request.getPassword()));
		user.setRole(Role.WORKER);
		repository.save(user);
	}

}
