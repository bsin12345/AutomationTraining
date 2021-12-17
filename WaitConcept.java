package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//dynamic
		driver.get("http://leafground.com/");
		
		//1.implicit wait: global
		//2.explicit wait: specific for elements
		
		driver.findElement(By.linkText("Wait to Appear")).click();
		//Thread.sleep(5000);//static
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"btn\"]/b"));
		wait.until(ExpectedConditions.visibilityOf(btn));
	
		 String text=btn.getText();
		 System.out.println(text);

	}

}
