package Nelito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Common {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver", "C:\\Software
		// RAHUL\\DRIVER\\geckodriver.exe");
		// WebDriver driver= new FirefoxDriver();

		// System.setProperty("webdriver.ie.driver", "C:\\Software
		// RAHUL\\DRIVER\\MicrosoftWebDriver.exe");
		// WebDriver driver= new InternetExplorerDriver();

		driver.get("https://www.google.com");
		// driver.manage().window().maximize();
		System.out.println("1st page :  " + driver.getTitle());
		System.out.println("Current URL : " + driver.getCurrentUrl());

	}

}
