package basic.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Book_Store {

	private WebDriver driver;
	BookStore Book;
	
	@Before
	public void setUp () throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	@Test
	public void NavigateBooks() throws InterruptedException{
		Book.AddBook();
		Thread.sleep(1000);
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

}
