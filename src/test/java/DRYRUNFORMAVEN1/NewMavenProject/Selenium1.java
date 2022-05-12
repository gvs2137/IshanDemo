package DRYRUNFORMAVEN1.NewMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium1
{
	@Test
public void seleniumtest()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gvikrams\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chromedriver.chromium.org/downloads");
	driver.manage().window().maximize();
	driver.close();
}
}
