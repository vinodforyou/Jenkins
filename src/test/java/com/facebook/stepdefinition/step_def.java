package com.facebook.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.facebook.runner.Runnerclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_def {

	WebDriver driver = Runnerclass.driver;
	@Given("user Launch The Facebook Url")
	public void user_launch_the_facebook_url() {
	    
		driver.get("https://www.facebook.com/index.php/");
		
		
	}
	@When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
	   
		driver.findElement(By.id("email")).sendKeys("vijay");
		
	}
	@When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() { 
		
		driver.findElement(By.id("pass")).sendKeys("vj124");
	    
		
	}
	@Then("user Clicked The Login Button And Navigate TO Next Page")
	public void user_clicked_the_login_button_and_navigate_to_next_page() {
	     
		driver.findElement(By.name("login")).click();
		
	}
	
}
