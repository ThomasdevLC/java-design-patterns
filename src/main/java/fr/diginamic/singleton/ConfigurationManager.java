package fr.diginamic.singleton;

import java.util.ResourceBundle;
import java.util.MissingResourceException;

public class ConfigurationManager {

	private static ConfigurationManager instance = new ConfigurationManager();
	private ResourceBundle resourceBundle;

	private static final String BUNDLE_NAME = "configuration";

	private ConfigurationManager() {
		try {
			resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
	}

	public static ConfigurationManager getInstance() {
		return instance;
	}

	public String getValue(String key) {
			return resourceBundle.getString(key);
	}
}
