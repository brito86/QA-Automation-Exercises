package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HappyPathAddNewUser {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		driver.findElement(By.name("UserFirstName")).sendKeys("Frida");		
		driver.findElement(By.name("UserLastName")).sendKeys("Kahlo");
		driver.findElement(By.name("UserTitle")).sendKeys("Mexican painter");		
		driver.findElement(By.name("UserEmail")).sendKeys("test@test.com");
		driver.findElement(By.name("UserPhone")).sendKeys("5149853650");
		
		//Identify Dropdown
		Select dropdown = new Select(driver.findElement(By.name("CompanyEmployees")));
		
		//Do that, select by visible text, by index or value
		
		// dropdown.selectByVisibleText("1 - 20 employees");
		// dropdown.selectByIndex(2);
		
		dropdown.selectByValue("500");
		Thread.sleep(1000);
		driver.findElement(By.name("CompanyName")).sendKeys("Frida Kahlo Museum");
		
		Select dropdown1 = new Select (driver.findElement(By.name("CompanyCountry")));
		dropdown1.selectByVisibleText("Mexico");
		Thread.sleep(1000);
		
		//selection checkbox
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("start my free trial")).click();
	}
}