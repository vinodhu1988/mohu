import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogOut_Demo
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		//    1. TITLE CHECK POINT
		String s1=driver.getTitle();
		String s2="actiTIME - Login";
		System.out.println(s1);
		
		if(s1.equals(s2))
		{
			System.out.println("Title check point is passed");
		}
		else
		{
			System.out.println("Title check point is failed"); 
		}
   		
		Thread.sleep(20000);
		
		
		
		String expectedText="Enter Time-Track";
		String actualText=driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		if(actualText.equals(expectedText))
		{
			System.out.println("Text checkpoint is passed");
		}
		else
		{
			System.out.println("text checkpoint is failed");
		}
		
		driver.findElement(By.id("logoutLink")).click();
		// 		3. URL CHECK POINT
		
		Thread.sleep(20000);		
		String actualURL="https://demo.actitime.com/login.do";
		String currentURL=driver.getCurrentUrl();
		if(actualURL.equals(currentURL))
		{
			System.out.println("URL checkpoint is passed");
		}
		else
		{
			System.out.println("URL checkpoint is failed");
		}
		
		
		//    CHECK BOX
		driver.get("https://krninformatix.com/sample.html");
		boolean chkboxstatus=driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus);
		
		driver.findElement(By.id("rem")).click();
		boolean chkboxstatus1=driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus1);
		
		driver.findElement(By.id("rem")).click();
		boolean chkboxstatus2=driver.findElement(By.id("rem")).isSelected();
		System.out.println(chkboxstatus2);
		
		if(!chkboxstatus2)
		{
			driver.findElement(By.id("rem")).click();
			boolean chkboxstatus3=driver.findElement(By.id("rem")).isSelected();
			System.out.println(chkboxstatus3);
		}
		
		// 		RADIO BUTTON
		boolean radiobuttonstatus= driver.findElement(By.id("male")).isSelected();
		driver.findElement(By.id("male")).click();
		System.out.println(radiobuttonstatus);
		
		boolean radiobuttonstatus1= driver.findElement(By.id("male")).isSelected();
		driver.findElement(By.id("male")).click();
		System.out.println(radiobuttonstatus1);
		
		boolean radiobuttonstatus2= driver.findElement(By.id("male")).isSelected();
		driver.findElement(By.id("male")).click();
		System.out.println(radiobuttonstatus2);
		
		if(radiobuttonstatus1)
		{
			System.out.println("radio button is clicked");
		}
		
		
		
	}
	
}
