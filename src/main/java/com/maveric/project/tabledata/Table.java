package com.maveric.project.tabledata;

import org.openqa.selenium.WebDriver;

import com.maveric.project.utils.DriverFactory;

public class Table {

	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

	}

}
