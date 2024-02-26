package githubprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Githubpgm1 {
	public static void function()
	{
		System.out.println("Launching facebook");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IT cell\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
