import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName_Logo
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean logostatus=driver.findElement(By.className("atLogoImg")).isDisplayed();
		System.out.println(logostatus);

	}

}
