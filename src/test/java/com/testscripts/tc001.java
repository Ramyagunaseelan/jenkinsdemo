package com.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc001 {

	
	@BeforeTest
	public void setup()
	{
		System.out.println("Open the browser");
	}
@Test
public void tctest()
{
System.out.println("TC001");
}
	
	@AfterTest
	public void Teardown()
	{
		System.out.println("close the browser");
	}

}
