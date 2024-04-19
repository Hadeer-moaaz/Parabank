package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentPage {

    private WebDriver driver;

    public BillPaymentPage(WebDriver driver){
        this.driver = driver;
    }


    private By payeeName = By.name("payee.name");
    private By address = By.name("payee.address.street");
    private By city = By.name("payee.address.city");
    private By state = By.name("payee.address.state");
    private By zipCode = By.name("payee.address.zipCode");
    private By phoneNumber = By.name("payee.phoneNumber");
    private By accountNumber = By.name("payee.accountNumber");
    private By verifyAccount = By.name("verifyAccount");
    private By amount = By.name("amount");
    private By submitButton = By.xpath("//input[@value=\"Send Payment\"]");

    public FindTransactionsPage BillPaymentSteps (){
        driver.findElement(payeeName).sendKeys("Hadeer");
        driver.findElement(address).sendKeys("9");
        driver.findElement(city).sendKeys("cairo");
        driver.findElement(state).sendKeys("Haram");
        driver.findElement(zipCode).sendKeys("56655");
        driver.findElement(phoneNumber).sendKeys("5356325555555");
        driver.findElement(accountNumber).sendKeys("19893");
        driver.findElement(verifyAccount).sendKeys("19893");
        driver.findElement(amount).sendKeys("1000");
        driver.findElement(submitButton).click();
        return new FindTransactionsPage(driver);
    }
}

