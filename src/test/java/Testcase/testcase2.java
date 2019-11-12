package Testcase;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class testcase2 {
	WebDriver driver;
	@Given("User launches chrome browser And navigates to application url")
	public void user_launches_chrome_browser_And_navigates_to_application_url() {
		 System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		   driver=new InternetExplorerDriver();
		   driver.manage().window().maximize();
		   driver.get("http://newtours.demoaut.com");
	}

	@When("user enters username as {string} in username field")
	public void user_enters_username_as_in_username_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	    }

	@When("user enters password as {string} in password field")
	public void user_enters_password_as_in_password_field(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	    }

	@And("click Signin")
	public void click_Signin() {
		driver.findElement(By.name("login")).click();
	    }

	@Then("validates login success")
	public void validates_login_success() {
		Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
		
	    }
}
