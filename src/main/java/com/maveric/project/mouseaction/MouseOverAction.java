package com.maveric.project.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.utils.DriverFactory;

public class MouseOverAction {
	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement mousehover = driver.findElement(By.id("mousehover"));
		WebElement mousetop = driver.findElement(By.xpath("//a[normalize-space()='Reload']"));
		action.moveToElement(mousehover).moveToElement(mousetop).click().perform();
		driver.quit();

	}

}
