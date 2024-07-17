package com.maveric.project.textboxdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.maveric.project.utils.DriverFactory;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Agile");
		driver.findElement(By.name("btnK")).click();
		// driver.close();

	}

}
