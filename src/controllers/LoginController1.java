package controllers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "lc")
@SessionScoped
public class LoginController1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String password;
	protected String passwordRepeat;
	protected Map<String, String> users = new HashMap<String, String>(); //new
	
	public LoginController1() {
		users.put("Zdravko", "123456");
		users.put("Mitko", "123456");
	}

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String enter() {

		String passwordCompare = null;

		if (!password.equals(passwordRepeat)) {
			passwordCompare = "The two passwords do not match";

			FacesMessage errorMessage = new FacesMessage(passwordCompare);
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage(null, errorMessage);

			return null;

		} else {
			
			users.put(name, password);
			return "exercise1-successful-login";
		}
	}
}
