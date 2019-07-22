package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		
		 driver.navigate().to("http://newtours.demoaut.com/");
		 WebElement link = driver.findElement(By.linkText("Cruises"));
		 
		 //Actions - keyboard/mouse etc
		 Actions MH = new Actions(driver); // do action on driver browser
		 //Mouseover on Cruise and build(identify) : complie the action
		 Action mouseover = MH.moveToElement(link).build();
		 //move mouse on the element
		 //build will identify the action and perform will do that: execute the action of moving to the element
		 mouseover.perform();
		 //sendkeys for keyboard action - this will press enter from keyboard
		 MH.sendKeys(link, (Keys.ENTER)).perform();
		 
		 // another way to press enter/click from keyboard
		// MH.sendKeys(link, (Keys.RETURN)).perform();
		 
		
	}

}
