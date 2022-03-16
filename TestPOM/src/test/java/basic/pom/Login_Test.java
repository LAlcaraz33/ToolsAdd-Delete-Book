package basic.pom;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Login_Test {
	
	private WebDriver driver;
	LoginPage logInPage;
	
	
	@Before
	public void setUp() throws Exception {
		logInPage = new LoginPage (driver);
		driver = logInPage.chromeDriverConnection();
		logInPage.visit("https://demoqa.com/login");
		driver.manage().window().maximize();
		
	}
	

	@Test
	public void LogIn() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		logInPage.logIn();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2500)","");
		logInPage.selectBook();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2500)","");
		logInPage.addBook();
		logInPage.deleteBook();
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

}
