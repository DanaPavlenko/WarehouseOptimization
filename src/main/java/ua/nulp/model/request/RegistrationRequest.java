package ua.nulp.model.request;

import org.springframework.stereotype.Component;

@Component
public class RegistrationRequest {

	private String email;

	private String password;

	private String repeatPassword;

	public RegistrationRequest() {
	}

	public RegistrationRequest(String email, String password, String repeatPassword) {
		this.email = email;
		this.password = password;
		this.repeatPassword = repeatPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

}
