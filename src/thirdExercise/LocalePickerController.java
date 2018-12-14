package thirdExercise;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "lpc")
@SessionScoped
public class LocalePickerController {

	private String locale = "en";
	private String[] localesList = new String[] { "en", "es", "mk" };

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String[] getLocalesList() {
		return localesList;
	}

}
