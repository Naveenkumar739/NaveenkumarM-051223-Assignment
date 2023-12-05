package SeleniumProject;

import customEntities.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends GenericMethods {
	GenericMethods gen=new GenericMethods();

@FindBy(xpath = "//li[@class='dropdown']//a[@title='My Account']")
public WebElement myAccountLoginButton;

@FindBy(xpath ="//a[.='Login']")
public WebElement clickOnLogin;

@FindBy(xpath = "//input[@type='submit']")
public WebElement clickLoginbutton;
@FindBy(xpath = "//input[@id='input-email']")
public WebElement email;
@FindBy(xpath = "//input[@id='input-password']")
public  WebElement password;

@FindBy(xpath = "//input[@class='form-control input-lg']")
public WebElement clickOnSearchBar;

@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
public WebElement clickSearchbtn;

@FindBy(xpath = "//a[text()='iMac'])[2]")
public WebElement assertimac;

@FindBy(xpath ="//a[text()='iMac']")
public WebElement imacbutton;
@FindBy(xpath ="//a[text()='MacBook']")
public WebElement mackbookbutton;
@FindBy(xpath = "//a[text()='MacBook Air']")
public WebElement mackbookair;
@FindBy(xpath = "//a[text()='MacBook Pro']")
public WebElement mackbookPro;
@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
public WebElement addcartbutton;
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
public WebElement SuccessAlert;
@FindBy(xpath = "//span[@id='cart-total']")
public WebElement cart;
@FindBy(xpath = "//strong[text()='Sub-Total']")
public WebElement subtotal;
@FindBy(xpath = "//strong[text()='View Cart']")
public WebElement veiwcart;
@FindBy(xpath = "//a[text()='Checkout']")
public WebElement checkout;
@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible'")
public  WebElement alert;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void ClickOnMyAccount(){
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.elementToBeClickable(myAccountLoginButton)).click();
	waitforeachelemnt(myAccountLoginButton,50);
 //myAccountLoginButton.click();
clickingonWebelemnt(myAccountLoginButton,20);
	sendkeysWebelemnt(email,"navan1@gmail.com");
	sendkeysWebelemnt(password,"Pass@123");
	clickLoginbutton.click();
}
public void ClickSearchBar() {
	clickOnSearchBar.click();
}
public void ClickOnSearchButton() {
	clickSearchbtn.click();
	
}
}
