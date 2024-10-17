package stepsdefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.Assert.*;

public class LoginSteps {

    static WebDriver browser;
    public static ChromeDriver driver;

    private void invoke(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to Windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-in-process-stack-traces");
        options.addArguments("--disable-logging");
        options.addArguments("--log-level=3");
        options.addArguments("--remote-allow-origins=*");
    }

    private void invokeWebPage(){

        ChromeOptions options = new ChromeOptions();

        // Open Browser in maximized mode
        options.addArguments("start-maximized");
        driver = new ChromeDriver();
        driver.get("https://app.playfunnel.net/");
    }

    private void checkAlertMessage(String message){

        WebElement errorMessage = driver.findElement(By.cssSelector(".alert.alert-danger"));
        assertEquals(message, errorMessage.getText());
    }

    @Given("The user is in the login page")
    public void theUserIsInTheMainPage() {

        System.out.println("<<theUserIsInTheMainPage>>");
        invokeWebPage();
    }

    @When("enter valid email")
    public void enterValidEmail() {

        System.out.println("<<enterValidEmail>>");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("juliangaca@hotmail.com");
    }

    @And("enter valid password")
    public void enterValidPassword() {

        System.out.println("<<enterValidPassword>>");
        WebElement pwdField = driver.findElement(By.id("password"));
        pwdField.sendKeys("funciona");
    }

    @And("click on Login button")
    public void clickOnLoginButton() {

        System.out.println("<<clickOnLoginButton>>");
        driver.findElement(By.className("btn-cMain")).click();
    }

    @Then("the user should be successfully login and redirected to dashboard page")
    public void theUserShouldBeSuccessfullyLoginToTheWebPage() {

        System.out.println("<<the user should be successfully login to the web page>>");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        assertEquals("https://app.playfunnel.net/dashboard", driver.getCurrentUrl());
    }

    @Then("the user should be displayed with empty user and password error messages")
    public void theUserShouldBeDisplayedWithEmptyUserAndPasswordErrorMessages() {

        System.out.println("<<theUserShouldBeDisplayedWithEmptyUserAndPasswordErrorMessages>>");

        List<WebElement> errorMessages = driver.findElements(By.cssSelector(".alert.alert-danger"));
        assertEquals(2, errorMessages.size());
        assertEquals("El campo email es requerido.", errorMessages.get(0).getText());
        assertEquals("El campo password es requerido.", errorMessages.get(1).getText());
    }


    @And("enter empty password")
    public void enterEmptyPassword() {
        System.out.println("<<enterEmptyPassword>>");
    }

    @Then("the user should be displayed with empty password error message")
    public void theUserShouldBeDisplayedWithEmptyPasswordErrorMessage() {

        System.out.println("<<theUserShouldBeDisplayedWithEmptyPasswordErrorMessage>>");
        String emptyPwdErrorMessage = "El campo password es requerido.";
        checkAlertMessage(emptyPwdErrorMessage);
    }

    @When("enter empty username")
    public void enterEmptyUsername() {
        System.out.println("<<enterEmptyUsername>>");
    }

    @Then("the user should be displayed with empty email error message")
    public void theUserShouldBeDisplayedWithEmptyEmailErrorMessage() {
        System.out.println("<<theUserShouldBeDisplayedWithEmptyEmailErrorMessage>>");
        String emptyEmailErrorMessage = "El campo email es requerido.";
        checkAlertMessage(emptyEmailErrorMessage);
    }

}
