package com.maveric.project.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.maveric.project.utils.DriverFactory;

public class IframeDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

//		WebElement out=driver.findElement(By.xpath("//div[@class='iframe-container']"));
//		driver.switchTo().frame(out);

		WebElement outerframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
		driver.switchTo().frame(outerframe);

		WebElement out1 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(out1);

		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("WelCome");

		Thread.sleep(20000);

		driver.quit();

	}
}
