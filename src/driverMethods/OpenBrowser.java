package driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Fb title: "+title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL:" +currentUrl);
		driver.navigate().to("https://www.amazon.sg/");
		String amztitle = driver.getTitle();
		System.out.println("amazon title: "+amztitle);
		driver.navigate().back();
		String title2 = driver.getTitle();
		System.out.println("Fb title: "+title2);
		driver.navigate().forward();
		String title3 = driver.getTitle();
		System.out.println("amazon title: "+title3);
		driver.navigate().refresh();
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("amazon url: "+currentUrl2);
		driver.quit();
		
		
		
		
		
	}

}
