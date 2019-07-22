package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//API command to maximize the browser
		driver1.manage().window().maximize();		
		 //open the URL in browser
		driver1.get("https://opensource-demo.orangehrmlive.com/"); 
		
		
		//find element and pass value to variable
		driver1.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver1.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver1.findElement(By.linkText("Dashboard")).click();
		// Get list of all links on page
		List <WebElement> links = driver1.findElements(By.tagName("a"));
		System.out.println("total links : "+links.size());
		 for(WebElement e : links) {
				 System.out.println(e.getText());
		 }
		

	}

}
