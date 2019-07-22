package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		// driver.get("http://newtours.demoaut.com/");
		 
		 //NAVIGATION methods  - 1st one
		 driver.navigate().to("http://newtours.demoaut.com/");
		 driver.findElement(By.linkText("Cruises")).click();
		 Thread.sleep(3000);
		 
		 //2nd navigation method  - back button is enabled
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 //3rd Navigation method  - forward button is enabled
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 //4th method
		 driver.navigate().refresh();
		 driver.close();

	}

}
