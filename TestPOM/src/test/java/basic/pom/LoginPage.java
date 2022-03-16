package basic.pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
	
	By userLocator =By.id("userName");
	By passLocator = By.id("password");
	By signInBtnLocator = By.id("login");
	By homePageLocator = By.id("userName-value");
	By storeLocator =By.id("gotoStore");
	By firstBookLocator = By.linkText("Git Pocket Guide");
	By addToLocator = By.xpath("//div[@class='text-right fullButton']");
	By acceptdeleteLocator = By.id("closeSmallModal-ok");
	By deleteBookLocator = By.id("delete-record-undefined");
	By acceptDeleteLocator = By.id("closeSmallModel-ok");
	
	
	public LoginPage(WebDriver driver ) {
		super(driver);
	}
	
	public void logIn() throws InterruptedException {
		if (isDisplayed(userLocator)) {
			type("LAlcaraz33",userLocator);
			type("Dl!140214",passLocator);
			click(signInBtnLocator);
		} else {
			System.out.println("username textbox was not present");
		}
	}
	
	public String getUserNameDisplayed() {
		if (isDisplayed(homePageLocator)) {
			return getText(homePageLocator);
		} else {
			return"";
		}
	}
	
	public void selectBook() throws InterruptedException {	
		findElement(storeLocator);
		click(storeLocator);
		Thread.sleep(1000);
		findElement(firstBookLocator);
		click(firstBookLocator);
	}
	
	public void addBook() throws InterruptedException {
		findElement(addToLocator);
		click(addToLocator);
		Thread.sleep(1000);
		Assert.assertEquals("Book added to your collection.", GetAlertText());
		AcceptAlert();
		Thread.sleep(1000);
	}
	
	public void deleteBook() throws InterruptedException {
		visit("https://demoqa.com/profile");
		Thread.sleep(1000);
		findElement(deleteBookLocator);
		click(deleteBookLocator);
		Thread.sleep(1000);
		findElement(acceptdeleteLocator);
		click(acceptdeleteLocator);
		Thread.sleep(1000);
		Assert.assertEquals("Book deleted.", GetAlertText());
		AcceptAlert();
		Thread.sleep(2500);
	}

}
