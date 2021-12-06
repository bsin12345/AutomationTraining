package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class SeleniumPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//1.id: unique - 1
		WebElement username=	driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement pword=	driver.findElement(By.id("txtPassword"));
		pword.sendKeys("admin123");

		WebElement loginBtn=	driver.findElement(By.id("btnLogin"));
		loginBtn.click();

		//	2.name: unique - 1

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		//3.xpath:2

		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();


		//4.cssSelector:2

		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();

		//5.linkText:3

		driver.findElement(By.linkText("Forgot your password?")).click();

		//6.partialLinkText: not recommended
 
		driver.findElement(By.partialLinkText("Forgot")).click();

		//		hey, do u face problem to sign in;
		//		hey, do u face problem to register;

		//7.className:4
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();











	}

}
