package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver .findElement(By.id("dropdown"));

		Select s1 = new Select(dropdown);
		s1.selectByIndex(2);
		s1.selectByVisibleText("Option 1");
		s1.selectByValue("2");
		
		
		
		
		
		
		
	}

}
