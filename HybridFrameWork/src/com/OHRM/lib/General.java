package com.OHRM.lib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global

{
	public static Logger logger = Logger.getLogger("General");
	

	

	public void setup()
	{
		//PropertyConfigurator.configure("log4j.properties");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		logger.info("Browser launched");
		
	}
	
	
	public void login() throws InterruptedException
	{
		d.findElement(By.xpath(xusername)).sendKeys(username);
		
		d.findElement(By.xpath(xpassword)).sendKeys(password);
		
		d.findElement(By.xpath(xlogin)).click();
		logger.info("login completed");
	}
	
	
	
	
	public void login_validation() throws IOException
	{
		try
		{
			String expectedText="Welcome Admin";
			System.out.print("The ExpectedText is: "+expectedText);
			System.out.println();
			String actualText=d.findElement(By.linkText(welcomeadminlink)).getText();
			if(actualText.contains(expectedText))
			{
				System.out.println("Successfully LogIn-----Test Passed");
				logger.info("Successfully LogIn-----Test Passed");
			}
			System.out.println();
			
		}
		catch(Exception e)
		{
			//    id="spanMessage"
			if(d.findElement(By.xpath(Invalidcredentials)).getText().equals("Invalid credentials"));
			{
				File screenshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(screenshot,new File("C:\\Users\\sekha\\workspace\\HybridwithExcelData\\src\\com\\OHRMScreenShots\\loginFaild.png"));
				
				System.out.println("LogIn Failed-----Test Failed");
				logger.info("LogIn Failed-----Test Failed");
				d.quit();
			}
		}
	}
		
		
	public void pim_addemp() throws InterruptedException, IOException
	{
		
		d.findElement(By.xpath(pim)).click();
		d.findElement(By.linkText(pimlinkaddemp)).click();
		d.findElement(By.xpath(addempfname)).sendKeys(fname);
		d.findElement(By.xpath(addemplname)).sendKeys(lname);
		//<input class="duplexBox" type="file" name="photofile" id="photofile">
		WebElement fileupload=d.findElement(By.xpath(addempchoosefile));
		fileupload.click();
		
		
		//Runtime.getRuntime().exec("C:\\Users\\sekha\\OneDrive\\Desktop\\picture.exe");
		d.findElement(By.xpath(addempsave)).click();
		System.out.println("FileUpload successfull");
		logger.info("FileUpload successfull");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public void teardown()
	{
		d.quit();
	}

}
