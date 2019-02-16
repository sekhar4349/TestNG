package com.OHRM.TestScripts;

import java.io.IOException;

import org.junit.Test;

import com.OHRM.lib.General;

public class TC_101 
{
	@Test
	public void Login_Test_Run() throws InterruptedException, IOException
	{
		General g=new General();
		g.setup();
		g.login();
		g.login_validation();
		g.teardown();
		
	}

}
