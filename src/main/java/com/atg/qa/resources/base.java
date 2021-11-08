package com.atg.qa.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public Properties prop;

	// Driver initialization
	public WebDriver initializedriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
		System.getProperty("user.dir") +"\\src\\main\\java\\com\\atg\\qa\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		// Chrome Broswer
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			// for headless execution
			// ChromeOptions options=new ChromeOptions();
			// options.addArguments("headless");
		driver = new ChromeDriver();
			// firefox browser
		} else if (browserName.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}
