package GithubPages;

import org.openqa.selenium.By;

public class Pages {
	public static final By SIGNIN_BUTTON = By.xpath("//a[@href='/login']");
	public static final By USERNAME_FIELD = By.id("login_field");
	public static final By PASSWORD_FIELD = By.id("password");
	public static final By LOGIN_BUTTON = By.xpath("//*[@type='submit']");
	public static final By LOGOUT_BUTTON = By.xpath("//*[@class='dropdown-item dropdown-signout']");
	public static final By PROFILE = By.xpath("//*[@aria-label='View profile and more']");
	public static final By SEARCH_BAR = By.xpath("//*[@data-test-selector='nav-search-input']");
}
