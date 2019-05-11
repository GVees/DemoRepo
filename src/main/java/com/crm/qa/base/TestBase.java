package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	
	
	WebDriver driver;
	String projectLocation =System.getProperty("user.dir");
	Properties prop;
	
	public TestBase()
	{
		init_properties();
		initialize();
		setup();
	}
	public void setup()
	{
		System.out.println("***This is test base setup method projectLocation**** : " +projectLocation );
		
	}
	
	public void initialize()
	{
		String propuri= prop.getProperty("url");
		System.out.println("***initialize****: "+propuri);
		
	}
public Properties init_properties()
{

	try {
		prop =new Properties();
		FileInputStream fis = new FileInputStream(projectLocation+"/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fis);
	} catch (Exception e) {
	  e.printStackTrace();
	}

	return prop;
}
	
}
