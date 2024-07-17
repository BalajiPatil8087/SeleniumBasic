package com.maveric.project.capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class CaptureScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.makemytrip.com/");
		TakesScreenshot takesscreenshot = (TakesScreenshot) driver;
		File src = takesscreenshot.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshot\\FirstScreenshot.png");
		FileUtils.copyFile(src, trg);

		/*
		 * 
		 * TakesScreenshot takesscreenshot=(TakesScreenshot)driver; File
		 * src=takesscreenshot.getScreenshotAs(OutputType.FILE); File trg=new
		 * File(".\\Screenshot\\FirstScreenshot.png"); FileUtils.copyFile(src, trg);
		 */

	}

}
