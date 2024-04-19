package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }


    private By firstName = By.id("customer.firstName");
    private By lastName = By.id("customer.lastName");
    private By address = By.id("customer.address.street");
    private By city = By.id("customer.address.city");
    private By state = By.id("customer.address.state");
    private By zipCode = By.id("customer.address.zipCode");
    private By phoneNumber = By.id("customer.phoneNumber");
    private By ssn = By.id("customer.ssn");
    private By username = By.id("customer.username");
    private By password = By.id("customer.password");
    private By confirmPassword = By.id("repeatedPassword");
    private By submitButton = By.xpath("//input[@value=\"Log In\"]");

    public LoginPage registrationSteps (){
        driver.findElement(firstName).sendKeys("Hadeer");
        driver.findElement(lastName).sendKeys("Ramy");
        driver.findElement(address).sendKeys("9");
        driver.findElement(city).sendKeys("cairo");
        driver.findElement(state).sendKeys("Haram");
        driver.findElement(zipCode).sendKeys("56655");
        driver.findElement(phoneNumber).sendKeys("5356325555555");
        driver.findElement(ssn).sendKeys("571");
        driver.findElement(username).sendKeys("Hadeer");
        driver.findElement(password).sendKeys("1234");
        driver.findElement(confirmPassword).sendKeys("1234");
        driver.findElement(submitButton).click();
        return new LoginPage(driver);
    }
}
