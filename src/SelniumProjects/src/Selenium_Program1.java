

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Program1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\FirefoxDriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		}
}