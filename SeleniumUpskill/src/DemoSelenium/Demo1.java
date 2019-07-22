package DemoSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			//WebDriver driver1 = new FirefoxDriver();
			FirefoxDriver driver1 = new FirefoxDriver();
			//API command to maximize the browser
			driver1.manage().window().maximize();		
			 //open the URL in browser
			driver1.get("https://opensource-demo.orangehrmlive.com/"); 
			
			//find element and pass value to variable
			driver1.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
			driver1.findElement(By.name("txtPassword")).sendKeys("admin123");
			driver1.findElement(By.id("btnLogin")).click();
			
			String title = driver1.getTitle();
			if(title.equals("OrangeHRM")) {
				
				System.out.println("Titles matched");	
				Thread.sleep(3000);   //waiting for home page to load
				driver1.findElement(By.id("welcome")).click();
				//	driver1.findElement(By.linkText("Logout")).click();
				// using xpath for logout
				driver1.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			
				// close the opened instance of browser. Will close only one instance
				driver1.close();
			
				//	driver1.quit();			To close multiple instances of browsers opened by selenium
				//common between close and quit - there is no return type, no arguments accepted
			}
			else {
				System.out.println("Titles are mismatching");
				driver1.close();
			}
		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PurnimaGarg\\Downloads\\chromedriver\\chromedriver.exe");
		//	WebDriver driver2 = new ChromeDriver();
			
			/*
			 				
			//alternate API to open a browser
			driver1.navigate().to("https://opensource-demo.orangehrmlive.com/");
			//for wait : 3 seconds - should not be used in real time
			Thread.sleep(3000);
			//Refresh the webpage
			driver1.navigate().refresh();
			
			*/
			
	}

}
