package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
			
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement	chk1 = driver.findElement(By.xpath("//input[@type='checkbox'])[1]"));
		chk1.click();	
		

	}

}
