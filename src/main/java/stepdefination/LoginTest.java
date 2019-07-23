package stepdefination;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.cucumber.listener.Reporter;
import base.Hooks;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Log;
import utility.PageElement;
import utility.WaitType;

public class LoginTest{
	WebDriver driver;
	private PageElement loginTitle;
	private PageElement userName;
	private PageElement password;
	private PageElement loginBtn;
	private PageElement registration;
	
	WebPage hooks;
	public LoginTest(Hooks hook) {
		driver=hook.beforeSetup();
		hooks = new WebPage(driver);
		loginTitle = new PageElement(By.xpath("//h4[contains(text(),'User Login')]"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 10);
		userName = new PageElement(By.name("username"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		password = new PageElement(By.name("password"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBEEENABLED, 1);
		loginBtn = new PageElement(By.name("submit"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 1);
		registration = new PageElement(By.linkText("Registration"), "Search Exch Drop Down List", false, WaitType.WAITFORELEMENTTOBECLICKABLE, 10);
		
	}

	@When("^title login page CIBIL")
	public void title_of_login_page_is_HMS(){
		String title = hooks.getTitle(loginTitle);
		System.out.println(title);
		Assert.assertEquals("User Login", title);
		Log.info("Verify the Title");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable data) {
		for (Map<String, String> mapref : data.asMaps(String.class, String.class)) {
			hooks.clearAndSendKeys(userName, mapref.get("username"));
			hooks.clearAndSendKeys(password, mapref.get("password"));

		}
	}
	@Then("^user clicks login button$")
	public void user_clicks_on_login_button() {
		hooks.click(loginBtn);
	}
	@Then("^user clicks registration links$")
	public void user_clicks_registration_link() {
		hooks.click(registration);
	}
	
	/*@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {

			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				File destinationPath =new File("D:\\TestGit\\BDD\\MavenProjectBDD\\Screenshot\\ScreenShotfail.png");
				FileUtils.copyFile(sourcePath, destinationPath);   
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}*/


	@After(order=1)
	public void closeBrowser(){

		driver.quit();

	}

}







