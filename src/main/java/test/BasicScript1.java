package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		driver.get("https://admin-demo.nopcommerce.com/login");
		
		String title = driver.getTitle();
		
		System.out.print("title is : " + title +"\n");
		
		WebElement textBox = driver.findElement(By.id("Email"));
		WebElement pass = driver.findElement(By.id("Password")); 
		WebElement submit = driver.findElement(By.cssSelector("#main > div > section > div > div.page-body > div.customer-blocks > div > form > div.buttons > button"));
		String text = submit.getText();
		
		
//		textBox.clear();
//		textBox.sendKeys("admin@yourstore.com");
//		pass.clear();
//		pass.sendKeys("admin");
//		submit.click();	
//		System.out.print("text of login button is: "+ text);	
//		driver.quit();
		
	}

}