package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;

public class casestudyIII {
	WebDriver driver;
	@Given("user opens test me app")
	public void user_opens_test_me_app() {
		System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		System.out.println("Open Application");
    }

	@Given("user clicks on sign in")
	public void user_clicks_on_sign_in() {
	    driver.findElement(By.linkText("SignIn")).click();
	    System.out.println("User clicks on sign in");
	}

	@Given("user enters username {string}")
	public void user_enters_username(String un) {
	    driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enters password {string}")
	public void user_enters_password(String pwd) {
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.name("Login")).click();
	}

	@Given("user clicks on all categories")
	public void user_clicks_on_all_categories() {
	    driver.findElement(By.xpath("//span[contains(text(),'All Categories')]")).click();
	}

	@Given("user clicks on electronics")
	public void user_clicks_on_electronics() {
	    driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
	}

	@Given("user clicks on headphones")
	public void user_clicks_on_headphones() {
	   driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]")).click();
	}

	@Given("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
	    driver.findElement(By.linkText("Add to cart")).click();
	}

	@Given("user clicks on cart")
	public void user_clicks_on_cart() {
	    driver.findElement(By.partialLinkText("Cart")).click();
	}

	@Given("user clicks on checkout")
	public void user_clicks_on_checkout() {
	   driver.findElement(By.linkText("Checkout")).click();
	   driver.close();
	}


}
