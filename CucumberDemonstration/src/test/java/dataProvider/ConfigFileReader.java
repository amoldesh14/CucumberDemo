package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class ConfigFileReader {

	protected Properties properties;
	private final String propertyFilePath = "configs//config.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties is not found at " + propertyFilePath);
		}
	}

	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser is not specified in the config.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url is not specified in the config.properties file.");
	}

	public String getUserName() {
		String userName = properties.getProperty("userName");
		if (userName != null)
			return userName;
		else
			throw new RuntimeException("userName is not specified in the config.properties file.");
	}

	public String getPassword() {
		String password = properties.getProperty("password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("password is not specified in the config.properties file.");
	}

	public String EncryptPassword(String StringToEncrypt) {
		String encrypted = "";
		try {
			String key = "mango";
			StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
			encryptor.setPassword(key);
			encrypted = encryptor.encrypt(StringToEncrypt);
			System.out.println("Encrypted password is " + encrypted);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encrypted;
	}

	public String DecryptPassword(String StringToDecrypt) {
		String decrypted = "";
		try {
			String key = "mango";
			StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
			encryptor.setPassword(key);
			decrypted = encryptor.decrypt(StringToDecrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decrypted;
	}

}