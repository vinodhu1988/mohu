import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Chrome_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
