package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnabledConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.termsfeed.com/profile/register");
		
		
		WebElement loginBtn=	driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/form/div/div[2]/div[2]/button/div"));
		boolean b1 =loginBtn.isDisplayed();
		System.out.println(b1);//true


		boolean b2	=loginBtn.isEnabled();
		System.out.println(b2);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/div/form/div/div[2]/div[1]/div[1]/input")).sendKeys("magesh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Brandsystems1");
		driver.findElement(By.id("password2")).sendKeys("Brandsystems1");


		boolean b3=	loginBtn.isEnabled();
		System.out.println(b3);
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkbox= driver.findElement(By.id("isAgeSelected"));
		// checkbox.click();

		boolean b4= checkbox.isSelected();
		System.out.println(b4);
	}

}
