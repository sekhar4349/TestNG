package com.OHRM.TestScripts;

import java.io.IOException;

import org.junit.Test;

import com.OHRM.lib.General;

public class TC_102 
{
	@Test
	public void Login_Test_addemployee() throws InterruptedException, IOException
	{
		General g=new General();
		g.setup();
		g.login();
		g.login_validation();
		g.pim_addemp();
		
		g.teardown();
		
	}

}
