package org.task;

import java.time.Duration;

import org.base.BaseClassMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample extends BaseClassMain {
	
	@BeforeClass
	
	public static void beforeClass() {
	    driver = new ChromeDriver();
	    driver.get("https://omrbranch.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }
	
	@AfterClass
	  public static void afterClass() {
	    driver.quit();
	  }
	
    @Parameters({"username","password"})
	@Test
	
	public void Login(String name, String pass) {
		
		WebElement txtUserName = driver.findElement(By.id("email"));
	    elementSendKeys(txtUserName,name );

	    WebElement txtPassword = driver.findElement(By.id("pass"));
	    elementSendKeys(txtPassword, pass);

	    WebElement btnLogin = driver.findElement(By.xpath("//button['value']"));
	    elementClick(btnLogin);
	}
    
    public static void main(String[] args) {
		System.out.println("Program started");
		System.out.println("Program running");
		System.out.println("Program Ended");
    	
	}
	
	
	
	
}
