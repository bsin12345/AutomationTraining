package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hongkiat.com/blog/");
		
		Actions action = new Actions(driver);
     //to perform mouse-over actions we can use this move to element by action class
    
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"all-menu\"]/span"))).build().perform(); 
    
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"post-58171\"]/a"))).click().build().perform();
				
	}

}
