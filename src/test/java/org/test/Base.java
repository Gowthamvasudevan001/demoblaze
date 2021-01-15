package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public static Alert sa;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.quit();
	}
	public void hall() {
		
	}
	
	public void gold() {
		driver.get("");
	}
	
	public void startTime() {
		Date st = new Date();
		System.out.println(st);
	}
	
	public void endTime() {
		Date et = new Date();
		System.out.println(et);
	}
	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public void fill(WebElement element,String txt) {
		element.sendKeys(txt);
	}
	
	public void click(WebElement element) {
		element.click();
		
	}
	
	public void screenShot() throws IOException {
		TakesScreenshot a=((TakesScreenshot)driver);
		File b = a.getScreenshotAs(OutputType.FILE);
		File c = new File("C:\\Users\\deLL\\eclipse-workspace\\Demoblaze\\screenshot\\Test.png");
		FileUtils.copyFile(b, c);
	}
	
	public void alert() {
		Alert sa=driver.switchTo().alert();
		sa.accept();
	
	}
}
