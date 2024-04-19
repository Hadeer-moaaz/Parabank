package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContact {

    private WebDriver driver;

    public UpdateContact(WebDriver driver){
        this.driver = driver;
    }

    private By UpdateContactInfoLink = By.xpath("//a[text()='Update Contact Info']");
    private By firstName = By.id("customer.firstName");
    private By submitBtn = By.xpath("//input[@value=\"Log In\"]");


    public RequestLoan UpdateContactInfo (){
        driver.findElement(UpdateContactInfoLink).click();
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys("Sara");
        driver.findElement(submitBtn).click();
        return new RequestLoan(driver);
    }

}
