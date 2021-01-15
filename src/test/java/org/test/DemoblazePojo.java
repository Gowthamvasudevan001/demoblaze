package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoblazePojo extends Base{

	public DemoblazePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='hrefch'])[2]")
	private WebElement nokia;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	private WebElement addtocart;
	
	@FindBy(id="cartur")
	private WebElement cart;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement place;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;

	@FindBy(xpath="//input[@id='card']")
	private WebElement card;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	private WebElement purchase;

	public WebElement getPurchase() {
		return purchase;
	}

	public WebElement getNokia() {
		return nokia;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	
	
	
}
