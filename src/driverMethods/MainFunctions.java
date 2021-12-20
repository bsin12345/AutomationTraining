package driverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.openqa.selenium.support.Color;

public class MainFunctions {

	public static WebDriver driver;

	public void launching() {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();                // maximizing window
		driver.get("https://www.facebook.com/");
	}

	public void verifyPlaceHolder() {

		String placeholder = driver.findElement(By.id("pass")).getAttribute("placeholder");
		System.out.println("Placeholder: "+placeholder);
	}

	public void verifyColor() {

		WebElement loginbtn = driver.findElement(By.name("login"));
		String rgbcolor = loginbtn.getCssValue("background-color");
		System.out.println("RGB color: "+rgbcolor );
		String hexcolor = Color.fromString(rgbcolor).asHex();
		System.out.println("HEX color:"+hexcolor);
	}

	public void verifyLocation() {
		Point loginlocation = driver.findElement(By.name("login")).getLocation();
		int xvalue = loginlocation.getX();
		int yvalue = loginlocation.getY();
		System.out.println("x value: "+xvalue+ "y value: "+yvalue);
	}


	public void verifyTooltip() {

		driver.navigate().to("http://www.leafground.com/pages/tooltip.html");
		WebElement agebox = driver.findElement(By.id("age"));
		String tooltip = agebox.getAttribute("title");
		System.out.println("Tooltip: "+tooltip);
	}

	public void verifyResize() throws InterruptedException {

		driver.navigate().to("http://testautomationpractice.blogspot.com/");
		
		Thread.sleep(2000);
		WebElement resize = driver.findElement(By.id("resizable"));
		String Beforeresize = resize.getAttribute("style");
		System.out.println("Before Resize: "+Beforeresize);
		
		Actions actions = new Actions(driver);
		WebElement pointer = driver.findElement(By.xpath("(//div[@id='resizable']/div)[3]"));
		actions.moveToElement(pointer).dragAndDropBy(pointer, 100, 0).build().perform();
		WebElement resize1 = driver.findElement(By.id("resizable"));
		String AfterResize = resize1.getAttribute("style");
		System.out.println("After Resize: "+AfterResize); 
	}

	public void tearDown() {
		driver.quit();
	}

}
