package driverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();              
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement firstbox = driver.findElement(By.id("email"));
		firstbox.sendKeys("selva@brandsystem");
		WebElement secondbox = driver.findElement(By.xpath("//input[@value='Append ']"));
		secondbox.sendKeys("selva");
		Robot robot = new Robot();                         //robot class syntax 
		for (int i = 1; i <=2; i++) {                      //using for loop for looping the same function many times
			robot.keyPress(KeyEvent.VK_TAB);               //keypress is a method to press the Vitual Keyboard's TAB 
			robot.keyRelease(KeyEvent.VK_TAB);             //keyrelease is a method to release the Vitual Keyboard's TAB
		}

		WebElement lastbox = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		lastbox.clear();                                    // clear method is used to clear the texts already inside textbox
		lastbox.sendKeys("Selva");

	}



}
