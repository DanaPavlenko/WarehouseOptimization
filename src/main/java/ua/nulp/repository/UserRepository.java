package ua.nulp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.nulp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByLogin(String login);
}
