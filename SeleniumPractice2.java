package ATB6X_LEARNING_SELENIUM.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPractice2 {
	EdgeDriver driver;
	@BeforeTest
	public void URL()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.idrive360.com/enterprise/login");
	}
		
	@Test
		public void Run() throws InterruptedException
		{
		//System.out.println(driver.gettitle());
		//Assert.AssertEquals(driver.getTittle(), "Login 	- VWO");
		
		driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		//driver.findElement(By.xpath("//input[@id='remember-me']")).click();
		driver.findElement(By.className("id-checkmark")).click();
		driver.findElement(By.id("frm-btn")).click();
		//Thread.sleep(3000);
		//WebElement error = driver.findElement(By.className("div.notification-box-description"));
		//System.out.println(error.getText());
		
	    Thread.sleep(20000);
	    //Assert.assertTrue(driver.findElement(By.cssSelector(".page-heading")).isDisplayed()); //Verify name on dashboard page. 

		driver.quit();
	
		}

	}
	

