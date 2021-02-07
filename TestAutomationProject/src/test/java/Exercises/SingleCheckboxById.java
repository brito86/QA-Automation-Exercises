package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleCheckboxById {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("isAgeSelected")).click();
	
	
	}

}