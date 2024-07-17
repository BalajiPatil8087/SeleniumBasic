package com.maveric.project.alertdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("welcome");
		driver.switchTo().alert().accept();
		// driver.quit();

	}

}
