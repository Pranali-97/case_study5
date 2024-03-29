package Testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class casestudyII {
		WebDriver driver;
		@Given("open the test me application")
		public void open_the_test_me_application() {
			System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8083/TestMeApp");
		}

		@When("user click on SignIn")
		public void user_click_on_SignIn() {
			driver.findElement(By.linkText("SignIn")).click();
			// System.out.println("click on sign");
		}

		@And("user enter UserName {string}")
		public void user_enter_UserName(String un) {
			driver.findElement(By.name("userName")).sendKeys(un);
		}

		@And("user enter Password {string}")
		public void user_enter_Password(String pw) {
			driver.findElement(By.name("password")).sendKeys(pw);
		}

		@Then("user click on login button")
		public void user_click_on_login_button() {
			driver.findElement(By.name("Login")).click();
			driver.close();
		}

	}