package com.newcconfigurationreader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Exception {
		
		File f = new File("C:\\Users\\richa\\eclipse-workspace\\Cucumber.Adactin_FRM\\src\\test\\java\\com\\propertyfile\\com\\PropertyFile.properties");
		
		FileInputStream fis  = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	public String browser_Name() {
		String browser = p.getProperty("Browser");
		System.out.println(browser);
		return browser;
	}
	
	public String get_Url() {
		String address = p.getProperty("url");
		System.out.println(address);
		return address;
	}
	
	public String user_Name() {
		String user = p.getProperty("username");
		System.out.println(user);
		return user;
	}
	
	public String Pass_word() {
		String pass = p.getProperty("password");
		System.out.println(pass);
		return pass;
	}
}
