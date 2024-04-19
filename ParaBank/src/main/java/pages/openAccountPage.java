package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class openAccountPage {

    private WebDriver driver;

    public openAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private By openNewAccountLink = By.xpath("//a[contains(text(),\"Open New Account\")]");
    private By openNewAccountBtn = By.xpath("//input[@value=\"Open New Account\"]");

    public BillPaymentPage openAccount (){
        driver.findElement(openNewAccountLink).click();
        driver.findElement(openNewAccountBtn).click();
        return new BillPaymentPage(driver);
    }

}
