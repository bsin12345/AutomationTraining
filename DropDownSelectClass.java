package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
    
	 	WebElement singledropdown= driver.findElement(By.id("dropdown1"));
		Select sel= new Select(singledropdown);
		sel.selectByIndex(2);
		sel.selectByValue("3");
		sel.selectByVisibleText("Loadrunner");
		
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
    
		List<WebElement> options= sel.getOptions();
		System.out.println(options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
    
		System.out.println(sel.isMultiple());//false
    
		WebElement multipledropdown= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select sel1= new Select(multipledropdown);
		sel1.selectByIndex(0);
		sel1.selectByValue("1");
		sel1.selectByVisibleText("Loadrunner");
		sel1.deselectByIndex(0);
		sel1.deselectAll();
    
		System.out.println(sel1.isMultiple());//true
    
		List<WebElement> options2 = sel1.getOptions();
		System.out.println(options2.size());
		List<WebElement> allSelectedOptions = sel1.getAllSelectedOptions();
		
		System.out.println(allSelectedOptions.size());
		List<WebElement> options3 = sel1.getOptions();
		for (WebElement webElement : options3) {
			System.out.println(webElement.getText());
			
		}
		
		
		
		
