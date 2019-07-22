package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PurnimaGarg\\Desktop\\Selenium-Reskill\\Selenium Jar Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		driver1.get("https://opensource-demo.orangehrmlive.com/"); 
		driver1.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Actions mouseover = new Actions(driver1);
		//mouseover.moveToElement(driver1.findElement(By.id("btnLogin"))).build().perform();		
		//mouseover.sendKeys(driver1.findElement(By.id("btnLogin")), (Keys.ENTER)).perform();

		mouseover.sendKeys(Keys.RETURN).perform();
		Thread.sleep(3000);
		//After login, 3 tabs to move to Marketplace link
		mouseover.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
	
	}

}
