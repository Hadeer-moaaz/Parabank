package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }



    private By usernameText = By.xpath("//input[@name=\"username\"]");
    private By passwordText = By.xpath("//input[@name=\"password\"]");
    private By submitBtn = By.xpath("//input[@value=\"Log In\"]");


    public openAccountPage loginSteps (){
        driver.findElement(usernameText).sendKeys("Hadeer");
        driver.findElement(passwordText).sendKeys("1234");
        driver.findElement(submitBtn).click();
        return new openAccountPage(driver);
    }

}
