package org.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoblaze extends Base{

	@BeforeClass
	public static void lau() {
		launchBrowser();
	}
	
	@AfterClass
	public static void clo() {
		close();
	}
	
	@BeforeMethod
	public void start() {
		startTime();
		}
	
	@AfterMethod
	public void end() {
		endTime();
	}
	
	
	@Test
	public void tc() throws InterruptedException, IOException {
		DemoblazePojo h = new DemoblazePojo();
		
		launchurl("https://www.demoblaze.com/");
		
		Thread.sleep(3000);
		
		click(h.getNokia());
		
		Thread.sleep(3000);
		
		click(h.getAddtocart());
		
		Thread.sleep(3000);
		
		alert();
		
		Thread.sleep(3000);
		
		click(h.getCart());
		
		Thread.sleep(3000);

		click(h.getPlace());
		
		Thread.sleep(3000);
				
		fill(h.getName(),"Gowthamvasudevan");
		
		fill(h.getCountry(), "India");
		
		fill(h.getCity(), "kumbakonam");
		
		fill(h.getCard(), "4524452145214455");
		
		fill(h.getMonth(), "06");
		
		fill(h.getYear(), "2026");
		
		click(h.getPurchase());
		
		screenShot();
	}
}
