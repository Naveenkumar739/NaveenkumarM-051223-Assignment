package SeleniumProject;
import customEntities.GenericMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login_Test {
	public static WebDriver driver;
	GenericMethods generic=new GenericMethods();

public LoginPage logindata;
@BeforeClass
@Parameters("baseURL")
public void setUp(String baseURL) {
	generic.Lauanch_Browser(baseURL);
	logindata = new LoginPage(driver);
}

	@Test(priority = 0)
	public void verifyloginWithValidCredentials()
	{
  	 logindata.ClickOnMyAccount();

		logindata.ClickSearchBar();
		logindata.ClickOnSearchButton();
		Assert.assertTrue(logindata.clickSearchbtn.isDisplayed());
		Assert.assertTrue(logindata.mackbookbutton.isDisplayed());
		Assert.assertTrue(logindata.mackbookair.isDisplayed());
		Assert.assertTrue(logindata.mackbookPro.isDisplayed());
		logindata.addcartbutton.click();

		Assert.assertTrue(logindata.SuccessAlert.isDisplayed());
		logindata.cart.click();

		Assert.assertTrue(logindata.subtotal.isDisplayed());
	logindata.veiwcart.click();
		logindata.checkout.click();
		Assert.assertTrue(logindata.alert.isDisplayed());


	}
	}
