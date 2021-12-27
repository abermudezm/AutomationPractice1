package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    private void invokeWebPage(){
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.automationtesting.in/");

        WebElement myAccountLink = driver.findElement(By.id("menu-item-50"));
        myAccountLink.click();
    }

    @Given("the user is in the main page")
    public void theUserIsInTheMainPage() {
        System.out.println("abm: theUserIsInTheMainPage");
        invokeWebPage();
    }

    @When("click on My Account menu")
    public void clickOnMyAccountMenu() {
        System.out.println("abm: clickOnMyAccountMenu");
    }

    @And("enter valid username")
    public void enterValidUsername() {
        System.out.println("Step Implementation");
    }

    @And("enter valid password")
    public void enterValidPassword() {
        System.out.println("Step Implementation");
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be successfully login to the web page")
    public void theUserShouldBeSuccessfullyLoginToTheWebPage() {
        System.out.println("Step Implementation");
    }

    @And("enter invalid username")
    public void enterInvalidUsername() {
        System.out.println("Step Implementation");
    }

    @And("enter invalid password")
    public void enterInvalidPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with invalid user\\/password error message")
    public void theUserShouldBeDisplayedWithInvalidUserPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter empty password")
    public void enterEmptyPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty password error message")
    public void theUserShouldBeDisplayedWithEmptyPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter empty username")
    public void enterEmptyUsername() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty user error message")
    public void theUserShouldBeDisplayedWithEmptyUserErrorMessage() {
        System.out.println("Step Implementation");
    }

    @Then("the user should be displayed with empty user\\/password error message")
    public void theUserShouldBeDisplayedWithEmptyUserPasswordErrorMessage() {
        System.out.println("Step Implementation");
    }

    @And("enter a password")
    public void enterAPassword() {
        System.out.println("Step Implementation");
    }

    @Then("the password should be masked")
    public void thePasswordShouldBeMasked() {
        System.out.println("Step Implementation");
    }

    @And("enter valid username in upper case")
    public void enterValidUsernameInUpperCase() {
        System.out.println("Step Implementation");
    }

    @And("enter valid password in upper case")
    public void enterValidPasswordInUpperCase() {
        System.out.println("Step Implementation");
    }
}
