package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="lc2")
@SessionScoped
public class LoginController2 extends LoginController1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void checkPassword(FacesContext context, UIComponent componentToValidate, Object value)
			throws ValidatorException {
		String pass = (String) value;
		if (pass.equals("password") || pass.equals("123456") || pass.equals("12345678") || pass.equals("qwerty") || pass.equals("abc123")) {
			String messageText = String.format("Password %s is not acceptable", pass);
			FacesMessage errorMessage = new FacesMessage(messageText);
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(errorMessage);
		}
	}
}
