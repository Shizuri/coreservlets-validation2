package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="lcsm")
@SessionScoped
public class LoginControllerSeparateMessages extends LoginController1{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String enter2() {

		String passwordCompare = null;

		if (!password.equals(passwordRepeat)) {
			passwordCompare = "The two passwords do not match";

			FacesMessage errorMessage = new FacesMessage(passwordCompare);
			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("formID1:repeatPassword", errorMessage);

			return null;

		} else {
			
			users.put(name, password);
			return "exercise1-successful-login-separate-message";
		}
	}
	
	
//	public String enter2() {
//
//		String messageText = null;
//		String passwordCompare = null;
//
//		if (!password.equals(passwordRepeat)) {
//			passwordCompare = "The two passwords do not match";
//
//			if (passwordCompare != null) {
//				FacesMessage errorMessage = new FacesMessage(passwordCompare);
//				errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
//				FacesContext.getCurrentInstance().addMessage("formID1:repeatPassword", errorMessage);
//
//				return null;
//			}
//
//		} else {
//
//			if (MyDatabase.USERS.get(name) == null) {
//				messageText = "Wrong User Name";
//			} else if (!MyDatabase.USERS.get(name).equals(password)) {
//				messageText = "Wrong Password";
//			}
//
//			if (messageText != null) {
//				FacesMessage errorMessage = new FacesMessage(messageText);
//				errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
//				FacesContext.getCurrentInstance().addMessage("formID1:password", errorMessage);
//
//				return null;
//			} else {
//				return "exercise1-successful-login-separate-message";
//			}
//
//		}
//
//		return "dead code";
//
//	}
}
