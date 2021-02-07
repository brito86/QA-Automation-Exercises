package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//*[contains(text(), 'Female')]")).click();
		driver.findElement(By.id("buttoncheck")).click();
		
		
	}

}