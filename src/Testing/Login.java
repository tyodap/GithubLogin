package Testing;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import GithubPages.Pages;
import GithubUtils.Utils;

class Login {

	private static WebDriver driver = null;
	
	@BeforeAll
	public static void setUp() {
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.github.com");
	}
	
	@Test
	public void GithubLogin() throws InterruptedException {
		try {
			driver.findElement(Pages.SIGNIN_BUTTON).click();
			Utils.pause(3000);
			driver.findElement(Pages.USERNAME_FIELD).sendKeys("");
			driver.findElement(Pages.PASSWORD_FIELD).sendKeys("");
			driver.findElement(Pages.LOGIN_BUTTON).click();
			Utils.pause(5000);
			WebElement search = driver.findElement(Pages.SEARCH_BAR);
			Assert.assertEquals(true, search.isDisplayed());
			driver.findElement(Pages.PROFILE).click();
			Utils.pause(5000);
			driver.findElement(Pages.LOGOUT_BUTTON).click();
			System.out.println("test_passed");
			driver.quit();
		} catch (AssertionError e) {
			String errorMsg = String.format("An error occured: %s", e);
			System.out.println(errorMsg);
		}
	}

}
