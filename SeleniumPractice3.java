package ATB6X_LEARNING_SELENIUM.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumPractice3 {
	EdgeDriver driver;
	@BeforeTest
	public void URL()
	{
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.idrive360.com/enterprise/login");
		 driver.manage().window().maximize();
	}
		
	@Test
		public void Run() throws InterruptedException
		{
		//System.out.println(driver.gettitle());
		//Assert.AssertEquals(driver.getTittle(), "Login 	- VWO");
		
		WebElement Email = driver.findElement(By.id("username")); Email.sendKeys("augtest_040823@idrive.com");
		WebElement Password = driver.findElement(By.id("password")); Password.sendKeys("123456");
		//driver.findElement(By.xpath("//input[@id='remember-me']")).click();
		WebElement check_button = driver.findElement(By.className("id-checkmark"));check_button.click();
		WebElement click_button = driver.findElement(By.id("frm-btn")); click_button.click();
		//Thread.sleep(3000);
		//WebElement error = driver.findElement(By.className("div.notification-box-description"));
		//System.out.println(error.getText());
    
	    Thread.sleep(20000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.idrive360.com/enterprise/account?upgradenow=true");
        Assert.assertEquals(driver.findElement(By.className("id-card-title")).getText(), "Your free trial has expired");


	    //Assert.assertTrue(driver.findElement(By.cssSelector(".page-heading")).isDisplayed()); //Verify name on dashboard page. 

		driver.quit();
	
		}

	}
	

