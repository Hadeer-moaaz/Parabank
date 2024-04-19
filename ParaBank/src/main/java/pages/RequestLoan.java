package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestLoan {

    private WebDriver driver;

    public RequestLoan (WebDriver driver){
        this.driver = driver;
    }

    private By amount = By.id("amount");
    private By downPayment = By.id("downPayment");
    private By submitBtn = By.xpath("//input[@value=\"Apply Now\"]");


    public RequestLoan requestLoanSteps (){
        driver.findElement(amount).sendKeys("500000");
        driver.findElement(downPayment).sendKeys("100000");
        driver.findElement(submitBtn).click();
        return this;
    }
}
