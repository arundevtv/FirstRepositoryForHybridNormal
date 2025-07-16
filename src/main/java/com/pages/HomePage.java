package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actiondriver.ActionDriver;
import com.base.BaseClass;

public class HomePage {
	private ActionDriver actionDriver;
/*	public HomePage(WebDriver driver) {
		this.actionDriver=new ActionDriver(driver);
	}*/
	

	public HomePage(WebDriver driver) {
		this.actionDriver=BaseClass.getActionDriver();
	}
	
	
/*	//Define locators using By class  ==for Orange HRM
	private By adminTab= By.xpath("//span[text()='Admin']");
	private By userIDButton= By.className("oxd-userdropdown-name");
	private By logoutButton= By.xpath("//a[text()='Logout']");
	private By oranageHRMlogo= By.xpath("//div[@class='oxd-brand-banner']//child::img");
	*/
	
	//Define locators using By class  ==for Swaglabs
	private By adminTab= By.xpath(" //*[@id=\"inventory_filter_container\"]/div");
	private By userIDButton= By.xpath("//button[text()='Open Menu']");
	private By logoutButton= By.xpath("//a[text()='Logout']");
	private By oranageHRMlogo= By.xpath("//div[@class='app_logo']");
	
	
	
	
	
	//Method to verify if Admin tab is visible
	public boolean isAdminTabVisible() {
	return actionDriver.isDisplayed(adminTab);
	}
	public boolean verifyOrangeHRMlogo() {
	return actionDriver.isDisplayed (oranageHRMlogo);
	}
	//Method to perform logout operation
	public void logout() {
	actionDriver.click(userIDButton);
	actionDriver.click(logoutButton);
	}
	
	

}
