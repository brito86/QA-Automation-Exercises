package Exercises;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLinksSizeByTagName{
	
	public static void main (String[] args) {

	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com");
	driver.manage().window().maximize();
	
	WebElement inputslink =  driver.findElement(By.linkText("Shifting Content"));
	inputslink.click();
	WebElement inputlink1 = driver.findElement(By.linkText("Example 1: Menu Element"));
	inputlink1.click();
	List<WebElement> links = driver.findElementsByTagName("li");
	System.out.print(links.size());
}
}