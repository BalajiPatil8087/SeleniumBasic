package com.maveric.project.selectdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maveric.project.utils.DriverFactory;

public class Sel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement drp = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(drp);

		List<WebElement> allopt = s.getOptions();

		for (WebElement ele : allopt) {
			s.selectByIndex(1);
		}
		driver.close();

//		WebDriver driver = DriverFactory.getDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.id("checkbox1")).click();
//		WebElement element=driver.findElement(By.id("checkbox1"));
//		System.out.println(element.isSelected());

		// driver.close();

	}

}
