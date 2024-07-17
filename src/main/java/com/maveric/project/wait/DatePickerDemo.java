package com.maveric.project.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class DatePickerDemo {
	static String Date = "Jun 26 2024";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[contains(@aria-label,'Replace')]/div".replace("Replace", Date))).click();
		// Thread.sleep(2000);
		// .driver.close();

	}
}
