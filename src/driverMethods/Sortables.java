package driverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();               
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='sortable']/li"));  //storing list of elements in List
		WebElement itemseven = list.get(6);                       //using index to pick up the element
		WebElement itemtwo = list.get(1);
		Actions actions = new Actions(driver);                    // syntax for Action class
		actions.clickAndHold(itemseven);                          // to pick up the element
		actions.moveToElement(itemtwo);                           // to move the element 
		actions.release(itemtwo);                                 // to release the element in the position
		actions.build().perform();                                // need to use this method at the end

	}



}
