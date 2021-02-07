package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		
		
		Select dropdown = new Select (driver.findElement(By.id("select-demo")));
		dropdown.selectByValue("Sunday");
		
		Select dropdown1 = new Select (driver.findElement(By.id("multi-select")));
		dropdown1.selectByValue("Florida");
		dropdown1.selectByValue("New York");
		dropdown1.selectByValue("New Jersey");

	}
}