package DemoSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PurnimaGarg\\Desktop\\Selenium-Reskill\\Selenium Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://realestate.upskills.in/wp-admin/"); 
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		String dashurl = driver.getCurrentUrl();
		System.out.println(dashurl);
		//driver.findElement(By.tagName("title")).getText();
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
			
		//driver.findElement(By.id("wp-admin-bar-my-account"));		just id wont work since id is under list and the link is below.
			//*[@id='wp-admin-bar-my-account']/a
		
		Actions hover = new Actions(driver);
	   // hover.moveToElement(link).build().perform();
		
		//context-click is for Right click
		hover.contextClick(link).build().perform();
		
		//click on open in new tab...first option in right click window
		//Actions ownt work here since it is not web level, but browser level action, we thus use Robot
		//hover.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);		//ctrl+tab takes you to new tab opened
		Thread.sleep(10000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
        if(dashurl.equals(url))
			System.out.println("Same Url");
		else			
			System.out.println("Different url");
	
	}
	
}
