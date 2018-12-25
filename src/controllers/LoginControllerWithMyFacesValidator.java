package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="myfaces")
@SessionScoped
public class LoginControllerWithMyFacesValidator extends LoginController1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String enter3() {
		users.put(name, password);
		return "exercise1-successful-login-myfaces";
	}

//	public String enter3() {
//
//		String messageText = null;
//
//		if (MyDatabaseDELETEME.USERS.get(name) == null) {
//			messageText = "Wrong User Name";
//		} else if (!MyDatabaseDELETEME.USERS.get(name).equals(password)) {
//			messageText = "Wrong Password";
//		}
//
//		if (messageText != null) {
//			FacesMessage errorMessage = new FacesMessage(messageText);
//			errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
//			FacesContext.getCurrentInstance().addMessage("formID1:password", errorMessage);
//
//			return null;
//		} else {
//			return "exercise1-successful-login-myfaces";
//		}
//
//	}
}
