package com.Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_launch {

	public static void main(String[] args) {

		WebDriverManager.iedriver().setup();

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.9.2");

		
		
	}

}
