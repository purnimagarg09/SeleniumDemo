package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PurnimaGarg\\Desktop\\Selenium-Reskill\\Selenium Jar Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		driver1.get("http://retail.upskills.in/admin/"); 
		driver1.findElement(By.id("input-username")).sendKeys("admin");
		driver1.findElement(By.id("input-password")).sendKeys("admin@123");
		driver1.findElement(By.xpath("//*[@class='btn btn-primary' and @type='submit'")).click();
		WebElement link = driver1.findElement(By.id("menu-catalog"));
		Actions act = new Actions(driver1);
		act.moveToElement(link).click().perform();
		//if we want to compile and run, then use build
		//act.moveToElement(link).click().build().perform();
	}
	//http://realestate.upskills.in/wp-admin/
	//admin / adminuser@12345

}
