package seleniumDemo.SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleCheck {

	@Test
	public void googleTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YUVRAJ\\git\\JenkinsGitDemo\\JenkinsGitDemo\\SeleniumDemo\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
