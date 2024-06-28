package fr.diginamic.singleton;

public class InitConfig {

	public static void main(String[] args) {
		ConfigurationManager configManager = ConfigurationManager.getInstance();

		String dbUrl = configManager.getValue("db.url");
		String dbUser = configManager.getValue("db.user");
		String dbPassword = configManager.getValue("db.password");

		System.out.println("URL : " + dbUrl);
		System.out.println("Utilisateur : " + dbUser);
		System.out.println("Mot de passe : " + dbPassword);
	}
}
