package veriousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class!!");
	}
	
	

	
//	public void main(String[] args) throws InterruptedException {
//		launchBrowser();
//		loginTest();
//		tearDown();
//
//		launchBrowser();
//		nagativeloginTest();
//		tearDown();
//
//	}
	
	
	
	@Before
	public void launchBrowser() {
		System.out.println("Before Launch Browser!!");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ullas\\July2021_Selenium\\Session1\\driver\\chromedriver.exe");		
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");	
	    //System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver" , "driver\\chromedriver.exe");	
		driver = new ChromeDriver();	
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void loginTest() throws InterruptedException {
		
		System.out.println("Login Test!!");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Test
	public void nagativeloginTest() throws InterruptedException {
		
		System.out.println("Nagative Login Test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1231");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@After
	public void tearDown() {
		
		System.out.println("Tear Down!!");
		driver.close();
		driver.quit();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class!!");
	}
	
}
