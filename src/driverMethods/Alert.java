package driverMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();               
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//simple alert
     driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);                                      //To make wait the next step
		driver.switchTo().alert().accept();                      //to choose 'OK' use accept method

		//confirm alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();                    //to choose 'cancel' use dismiss method

		//promt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");                                
		String actualtext = alert.getText();                      //getting the actual text from application
		alert.accept();
		String expectedValue = "I'm a JS prompt";                //Requirement is our expected value
		if (actualtext.equals(expectedValue)) {                  // comparing these two values
			System.out.println("Texts are equal");

		} else {
			System.out.println("texts are not equal");
		}
	}
}
