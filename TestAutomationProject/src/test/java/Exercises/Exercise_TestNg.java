package Exercises;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise_TestNg {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/table-records-filter-demo.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void logout() {
		System.out.println("Test logout");
		
	}

}
