import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo_IE_Browser
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "F:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();


	}

}
