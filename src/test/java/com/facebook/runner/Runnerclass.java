package com.facebook.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\vijay\\eclipse-workspace\\Maven-Datadriven\\IPT_cucumber_OCT\\src\\test\\java\\com\\facebook\\feature\\facebook.feature",
glue = "com.facebook.stepdefinition",publish = true,
plugin = {"pretty","json:target/json-reports/report2.json"})

//dry run = true   => it will only execute the output not the process
//monochrome = true => it will change unreadble text into readble text
//html report : 
//html:target/cucumber-reports/report.html => generate the html format report
//json report : 
//json:target/json-reports/report2.json => generate the json format report 

public class Runnerclass {
    
 public	static WebDriver driver;
 
 @BeforeClass
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();

	}

 @AfterClass
	public static void close() {

		driver.close();
	
	}

}
