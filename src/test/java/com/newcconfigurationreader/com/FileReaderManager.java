package com.newcconfigurationreader.com;

public class FileReaderManager {
	
	private FileReaderManager() {
		
		//make the class constructor private son this class cannot be extended but can be used in another class
	}

	
	public FileReaderManager getInstanceOfFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	
	public static Configuration_Reader get_Instance_Of_CR() throws Throwable {
		Configuration_Reader cr= new Configuration_Reader();
		return cr;
	}
}


