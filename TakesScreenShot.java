package seleniumdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//TakesScreenshot ts= (TakesScreenshot)driver;
		WebElement logo=	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		File source=	logo.getScreenshotAs(OutputType.FILE);
		File target= new File(".\\screenshots\\fbHomePage.png");
		FileHandler.copy(source, target);

	}

}
