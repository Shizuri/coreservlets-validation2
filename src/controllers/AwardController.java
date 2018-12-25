package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="ac")
@SessionScoped
public class AwardController {

	private String name;
	private String location = "en";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String go() {
		return "exercise3-award-response";
	}
	
	public void setToMk(ActionEvent event) {
		location = "mk";
	}
	
	public void setToEn(ActionEvent event) {
		location = "en";
	}
}
