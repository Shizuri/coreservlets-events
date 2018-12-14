package firstAndSecondExercise;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ccc")
public class ColorChangerController {

	private String theme = "light";
	private String[] themes = new String[] {"light", "dark"};
	
	public void setToLight(ActionEvent event) {
		theme = "light";
	}
	
	public void setToDark(ActionEvent event) {
		theme = "dark";
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String[] getThemes() {
		return themes;
	}

}
