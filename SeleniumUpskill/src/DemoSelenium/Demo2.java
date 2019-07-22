package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/");
		
		// To store an element in a variable
		 WebElement username = driver.findElement(By.name("userName"));
		 if(username.isEnabled()) {
			 
			 //sending value to username
			 username.sendKeys("manzoor");
			 username.clear();
			 username.sendKeys("manzoor");
		 }
		 
		 if(username.isDisplayed()) {
			 System.out.println("Username value is displayed");
			 
			 //Getattribute is used to get user passed values of edit text fields or if element attribute value is dynamic
			 System.out.println("username : "+username.getAttribute("value"));
			 System.out.println(username.getAttribute("name"));
			 
			 //getText to get the label, dropdown, links
			 System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText());
		 }
		 WebElement password = driver.findElement(By.name("password"));
		 password.sendKeys("manzoor");
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(5000);
		 
		 WebElement type = driver.findElement(By.xpath("//input[@name='tripType' and @value='roundtrip']"));
		 if(type.isSelected()) {
			 driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']")).click();
		 }
			 
		WebElement number = driver.findElement(By.name("passCount"));
		//select is going to click on the drop down
		Select sel = new Select(number);
		//get all the values of dropdown and storing the list in a list of webelements
		List<WebElement> options = sel.getOptions();
		System.out.println(options.size());
		
		 for(int i =0; i<options.size() ; i++){
			 System.out.println(options.get(i).getText());
		}
		 
		 //Different options to select a drop down value
		//sel.selectByValue("3");
		// sel.selectByIndex(3);			index starts with 0
		 sel.selectByVisibleText("1");		
		 WebElement selOption = sel.getFirstSelectedOption();
		 System.out.println("Number of passengers selected :"+selOption.getAttribute("value"));
		 
		 //Alternate way
		 //System.out.println("Number of passengers selected :"+number.getAttribute("value"));
		 
		 driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		 driver.findElement(By.name("findFlights")).click();
		
		 Thread.sleep(3000);
		 //Continue button on next page
		 driver.findElement(By.name("reserveFlights")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Purnima");
		 driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Garg");
		 driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("1234567890");
		 
		 //Since multiple checkboxes with same attributes, use findElements
		 List<WebElement> check = driver.findElements(By.xpath("//input[@name='ticketLess' and @value='checkbox']"));
		 
		 //Loop to click both the checkboxes
		for(WebElement e : check) {
			 e.click();
		 }

		// If we want to selectonly one checkbox say second one
		 //check.get(1).click();
		 
		 driver.findElement(By.name("buyFlights")).click();
		 driver.findElement(By.linkText("SIGN-OFF")).click();
	}

}
