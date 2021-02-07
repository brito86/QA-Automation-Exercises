package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOpenLinks {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/index.php/auth/requestPasswordResetCode']")).click();

		driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");

	}

}