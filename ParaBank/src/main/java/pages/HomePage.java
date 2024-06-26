package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private  By registerLink = By.xpath("//a[text()='Register']");

    public RegisterPage registration (){
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }

}
