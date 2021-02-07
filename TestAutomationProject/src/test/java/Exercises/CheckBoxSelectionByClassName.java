package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CheckBoxSelectionByClassName {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Marcelo");		
		driver.findElement(By.name("UserLastName")).sendKeys("Silva");
		driver.findElement(By.name("UserTitle")).sendKeys("Singer");		
		driver.findElement(By.name("UserEmail")).sendKeys("test@test.com");		
		driver.findElement(By.name("UserPhone")).sendKeys("5149853650");	
		//Identify Dropdown
		Select dropdown = new Select(driver.findElement(By.name("CompanyEmployees")));		
		//Do that, select by visible text, by index or value		
		// dropdown.selectByVisibleText("1 - 20 employees");
		// dropdown.selectByIndex(2);
		
		dropdown.selectByValue("500");
		Thread.sleep(1000);
		driver.findElement(By.name("CompanyName")).sendKeys("Amazon");
		
		Select dropdown1 = new Select (driver.findElement(By.name("CompanyCountry")));
		dropdown1.selectByVisibleText("Israel");
		Thread.sleep(1000);
		
    //click 
		driver.findElement(By.className("checkbox-ui")).click();
	}
}
