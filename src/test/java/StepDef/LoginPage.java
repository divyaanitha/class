package StepDef;

import org.openqa.selenium.WebDriver;

import Utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class LoginPage extends Base {
WebDriver driver;
Login lo;
	@Given("Launch the browser")
	public void launch_the_browser() {
	 driver=LaunchBrowser();
	 maxi();
	 iWait(10);
	lo=new Login(driver);
		
	}

	@Given("open the application")
	public void open_the_application() {
	openURL("https://www.facebook.com/");
	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
	    type(lo.getUsername(),username);
	    type(lo.getPassword(),password);
	}

	@When("click the login button")
	public void click_the_login_button() {
	    tap(lo.getLogin());
	}

	@Then("validate the login {string} messaage")
	public void validate_the_login_messaage(String msg ) {
	    System.out.println(msg);
	    closeBrowser();
	    
	    
	    
	}	
	
}
	
	
	
	

