package com.maveric.project.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maveric.project.utils.DriverFactory;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		// driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		Actions action = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("//button[normalize-space()='Double-click me']"));
		action.doubleClick(ele).perform();
		driver.quit();
	}
}
