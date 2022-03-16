package basic.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStore extends Base {
	
	By storeLocator =By.id("submit");
	By firstBookLocator = By.linkText("Git Pocket Guide");
	By addToCollectionLocator = By.id("addNewRecordButton");
	By profilePageLocator = By.xpath("//li[@id ='item-3' and contains(@class, 'btn-light active')]");
	By deleteBookLocator = By.id("delete-record-undefined");
	By acceptDeleteLocator = By.id("closeSmallModel-ok");
	

	public BookStore(WebDriver driver) {
		super (driver);
	}
	
	public void AddBook() throws InterruptedException {
		
		findElement(storeLocator);
		click(storeLocator);
		Thread.sleep(1000);
		findElement(firstBookLocator);
		click(firstBookLocator);
	}

}
