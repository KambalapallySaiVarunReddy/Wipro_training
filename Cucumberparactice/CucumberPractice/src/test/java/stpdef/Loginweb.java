package stpdef;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginweb {
    WebDriver driver;
    WebDriverWait wait;

    @Given("open the browser and launch the login page")
    public void open_the_browser_and_launch_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
    }

    @When("login with username {string} and password {string}")
    public void login_with_username_and_password(String username, String password) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_MainContent_username"))).sendKeys(username);
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    @Then("should see the home page")
    public void should_see_the_home_page() {
        // simple check: Orders page table should be visible
        boolean isHome = driver.findElement(By.id("ctl00_MainContent_orderGrid")).isDisplayed();
        System.out.println("Home page visible? " + isHome);

        if (driver != null)
            driver.quit();
    }

    @Then("should see an error message")
    public void should_see_an_error_message() {
        // simple check: error label should be visible
        boolean isError = driver.findElement(By.id("ctl00_MainContent_status")).isDisplayed();
        System.out.println("Error message visible? " + isError);

        if (driver != null)
            driver.quit();
    }
}

