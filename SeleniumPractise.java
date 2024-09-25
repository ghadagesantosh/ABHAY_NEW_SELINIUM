package ATB6X_LEARNING_SELENIUM.Selenium;

import io.qameta.allure.Description;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPractise {
	EdgeDriver driver;
	@BeforeTest
	public void URL()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://app.vwo.com/#/login");
	}
		
	@Test
		public void Run() throws InterruptedException
		{
		//System.out.println(driver.gettitle());
		//Assert.AssertEquals(driver.getTittle(), "Login 	- VWO");
		
		driver.findElement(By.id("login-username")).sendKeys("vwo@1secmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vwo@1234");
		driver.findElement(By.xpath("//span[text()=\"Remember me\"]")).click();
		driver.findElement(By.id("js-login-btn")).click();
		//Thread.sleep(3000);
		//WebElement error = driver.findElement(By.className("div.notification-box-description"));
		//System.out.println(error.getText());
		
	    Thread.sleep(5000);
	    Assert.assertTrue(driver.findElement(By.cssSelector(".page-heading")).isDisplayed()); //Verify name on dashboard page. 

		driver.quit();
	
		}
	}
