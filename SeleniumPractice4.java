package ATB6X_LEARNING_SELENIUM.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumPractice4 {
	public class idrive360 {

	    @Test
	    public void assignment3() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.idrive360.com/enterprise/login");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("augtest_040823@idrive.com");
	        driver.findElement(By.id("password")).sendKeys("123456");
	        driver.findElement(By.id("frm-btn")).click();
	        Thread.sleep(15000);
	        Assert.assertEquals(driver.findElement(By.className("id-card-title")).getText(), "Your free trial has expired");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://www.idrive360.com/enterprise/account?upgradenow=true");
	        driver.quit();





	    }

}
}
