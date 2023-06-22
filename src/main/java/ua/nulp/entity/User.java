package ua.nulp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "_user")
public class User extends AbstractEntity {

	private String login;

	private String password;

	private Role role;

	public User() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
