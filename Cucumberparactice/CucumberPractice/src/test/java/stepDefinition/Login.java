package stepDefinition;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("open the browser and launch the login page")
	public void open_the_browser_and_launch_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
	}
	
	
	@When("login with username {string} and password {string}")
	public void login_with_username_and_password(String username , String password){
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ico-login']"))).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	
	@Then("should see the home page")
	public void  should_see_the_home_page() {
		if(driver != null)
			driver.quit();
	}
	@Then("should see an error message")
	public void should_see_an_error_message() {
		if(driver != null)
			driver.quit();
	}


}
