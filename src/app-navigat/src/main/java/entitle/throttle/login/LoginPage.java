package entitle.throttle.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import entitle.throttle.AbstractPage;

public class LoginPage extends AbstractPage {
	@FindBy(name = "userName")
	private WebElement userName;
	@FindBy(name = "password")
	private WebElement secret;
	@FindBy(id = "submitButton")
	private WebElement loginButton;

	
	public LoginPage(WebDriver driver) {
		super(driver);
		super.loadPage(LoginPageConstant.LOGIN_URL);
//    super.loadPage(LoginPageConstant.LOGIN_URLS);
	}

	public LandingPage login(String username, String password) {
		userName.sendKeys(username);
		secret.sendKeys(password);
		loginButton.click();
		LandingPage land = new LandingPage(getDriver());
		land.makePage();
		land.empPage();
		land.empPage1();
		return land;
	}

}
