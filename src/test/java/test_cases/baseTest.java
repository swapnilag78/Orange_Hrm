package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class baseTest {
	public static WebDriver webdriver_driver;
	loginPage loginpage_obj;
	@BeforeClass
	public void setupwindow() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		webdriver_driver = new ChromeDriver();
		
		
		webdriver_driver.manage().window().maximize();
		webdriver_driver.get("https://sanjay29-trials76.orangehrmlive.com/");
		Thread.sleep(4000);
		System.out.println("Login Page is Opened!");
		
		loginpage_obj = new loginPage(webdriver_driver);
		System.out.println("Opening the browser");
		loginpage_obj.login("Admin", "XwFwrZ28@Y");
		Thread.sleep(2000);
		
		
	}

	
	@AfterClass
	public void close() {
		webdriver_driver.close();
	}
}
