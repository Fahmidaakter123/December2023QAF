package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjects {
   
	WebDriver driver;
	
	public pageobjects(WebDriver drive){
	 this.driver = driver;
	PageFactory.initElements(drive,this);
	
	}
	
	
//WebElement searchBox	= driver.findElemet(By.id(APjFqb"));
	
	//page Factory
	
	@FindBy(id="APjFqb")
	
	WebElement searchBox;
	
	public void entersearch(String string) {
	
	searchBox.sendKeys(string);
	
	}
	//WebElement searchButton = drive.findElement(By.name("btnK"));
	
	@FindBy(name="btnK")
	
	WebElement searchButton;
	
	public  void clicksearch() {
	
	searchButton.submit();
	
	
	}
	}
