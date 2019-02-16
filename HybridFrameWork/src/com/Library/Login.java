package com.Library;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Login 
{
	
	public static Logger logger=Logger.getLogger(" ");
	public static void info(String Message)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info(Message);
	}

}
