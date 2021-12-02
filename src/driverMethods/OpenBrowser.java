package driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\bs_selva\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();                // maximizing window
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();                   // to get the title of the page
		System.out.println("Fb title: "+title);
		String currentUrl = driver.getCurrentUrl();         // to get url of the current page
		System.out.println("URL:" +currentUrl);
		driver.navigate().to("https://www.amazon.sg/");     // navigating to different url
		String amztitle = driver.getTitle();
		System.out.println("amazon title: "+amztitle);
		driver.navigate().back();                          // to navigate back
		String title2 = driver.getTitle();
		System.out.println("Fb title: "+title2);
		driver.navigate().forward();                       // to navigate forward
		String title3 = driver.getTitle();
		System.out.println("amazon title: "+title3);
		driver.navigate().refresh();                       // to refresh the page
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("amazon url: "+currentUrl2);
		driver.quit();                                     // to quit the chrome





	}

}
