package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcase1 {
	WebDriver driver;
	@Given("User opens application newtours.demoaut.com")
    public void user_opens_application_newtours_demoaut_com() {
	   System.setProperty("webdriver.ie.driver", "C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	   driver=new InternetExplorerDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("http://newtours.demoaut.com");
	   //System.out.println("Opens Application");	  
    }

	@When("User clicks on Registration")
	public void user_clicks_on_Registration() {
	//Actions a =new Actions(driver);	
	driver.findElement(By.linkText("REGISTER")).click();
	    System.out.println("User clicks on Registration");
	   
	}

	@And("User enters first name")
	public void user_enters_first_name() {
	   // System.out.println("User enters first name");
	    WebElement fn=driver.findElement(By.name("firstName"));
		fn.sendKeys("Pranali");
		System.out.println("enter first name");
	    
	}

	@And("User enters password")
	public void user_enters_password() {
		WebElement ps=driver.findElement(By.name("password"));
		ps.sendKeys("Pranali@123");
	    System.out.println("User enters password");
	    
	}

	@And("User enters confirms password")
	public void user_enters_confirms_password() {
		WebElement cps=driver.findElement(By.name("confirmPassword"));
		cps.sendKeys("Pranali@123");
	    System.out.println("User enters confirm password");
	    
	}

	@And("User clicks on register button")
	public void user_clicks_on_register_button() {
		WebElement myImgBtn= driver.findElement(By.name("register"));
		  myImgBtn.click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	    System.out.println("click on register button");
	    
	}

	@Then("Registration is succesful")
	public void registration_is_succesful() {
	    System.out.println("Registration is successful");
	    
	}
	
	@Given("user logins to testme app with valid data")
	public void user_logins_to_testme_app_with_valid_data() {
	    System.out.println("user logins to testme app with valid data");
	}

	@Given("user searches the valid product")
	public void user_searches_the_valid_product() {
		System.out.println("user seaches the valid product");
	    
	}

	@Given("user does the payment")
	public void user_does_the_payment() {
		System.out.println("user does the payment");
	    
	}

	@Given("user logouts from testme app")
	public void user_logouts_from_testme_app() {
		System.out.println("user logouts from testme app");
	   
	}

}







