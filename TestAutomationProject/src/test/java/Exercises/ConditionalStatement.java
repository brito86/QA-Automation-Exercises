package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalStatement {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Rick");
		// Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("Login")).click();

		String myerror = driver.findElement(By.id("error")).getText();
	

		if (myerror.equals(
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.")) {
			System.out.print("The message is correct");
		} else
			System.out.print("The message is not correct");

	}
}