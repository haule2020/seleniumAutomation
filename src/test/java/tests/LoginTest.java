package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
		
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=' Dashboard']")));
		
		String url = driver.getCurrentUrl();
		
		System.out.print("url is : " + url);
		
		System.out.print("title is : " + driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		

	}
	
}
