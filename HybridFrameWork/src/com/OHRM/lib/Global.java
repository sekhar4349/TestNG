package com.OHRM.lib;

import org.openqa.selenium.WebDriver;

import com.Library.Login;

public class Global extends Login
{
	public WebDriver d;
	
	// SEND DATA
	public String url="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public String username="sekhar4349";
	public String password="Sekhar4349!@#";
	public String fname="Reddy";
	public String lname="sekhar";
	
	
	// lOCATORS
	
	public String xusername="//*[@id='txtUsername']";
	public String xpassword="//*[@id='txtPassword']";
	public String xlogin="//*[@id='btnLogin']";
	public String Invalidcredentials="//*[@id='spanMessage']";
	               //PIM//
	public String pim="//*[@id='menu_pim_viewPimModule']/b";
	public String pimlinkconfigure="Configuration";
	public String pimlinkemplist="Employee List";
	public String pimlinkaddemp="Add Employee";
	public String pimlinkreports="Reports";
	                      //addemp//
	public String addempfname="//input[@id='firstName']";
	public String addemplname="//input[@id='lastName']";
	public String addempchoosefile="//input[@id='photofile']";
	public String addempsave="//input[@id='btnSave']";
	
	
	public String welcomeadminlink="Welcome Admin";
	public String logoutlink="Logout";
	

}
