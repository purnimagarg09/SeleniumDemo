package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PurnimaGarg\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/");
		 
		 int countConst=0, countWork=0;

		 List <WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("total links : "+links.size());
			
		 String[] linkConst = new String[links.size()];
		 String[] linkWork =  new String[links.size()];
			 for(WebElement e : links) {
					// System.out.println(e.getText() + "  " + e.getAttribute("href"));		
					 if(e.getAttribute("href").contains("mercuryunderconst")) {
						 linkConst[countConst]=e.getText();
						 countConst++;
					 }
						
					 else {
						 linkWork[countWork]=e.getText();
						 countWork++;
					 }
			 }
			 
		System.out.println("Number of Links under construction :" + countConst);
		for(int j=0;j<countConst;j++)
			System.out.println(linkConst[j]);
		System.out.println();
		System.out.println("Number of Links working :" + countWork);
		for(int k=0;k<countWork;k++)
			System.out.println(linkWork[k]);
	}

}
