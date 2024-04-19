package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindTransactionsPage {

    private WebDriver driver;

    public FindTransactionsPage(WebDriver driver){
        this.driver = driver;
    }
    private By transactionId = By.id("criteria.transactionId");
    private By transactionIdLink = By.xpath("//button[@ng-click=\"criteria.searchType = 'ID'\"]");


    private By onDate = By.id("criteria.onDate");
    private By transactionDate = By.xpath("//button[@ng-click=\"criteria.searchType = 'DATE'\"]");

    private By fromDate = By.id("criteria.fromDate");
    private By toDate = By.id("criteria.toDate");
    private By transactionDATE_RANGE = By.xpath("    //button[@ng-click=\"criteria.searchType = 'DATE_RANGE'\"]");

    private By amount = By.id("criteria.amount");
    private By transactionAMOUNT = By.xpath("//button[@ng-click=\"criteria.searchType = 'AMOUNT'\"]");





    public UpdateContact openAccount (){
        driver.findElement(transactionId).sendKeys("12452");
        driver.findElement(transactionId).click();
        driver.findElement(onDate).sendKeys("18/8");
        driver.findElement(transactionDate).click();
        driver.findElement(fromDate).sendKeys("18/8");
        driver.findElement(toDate).sendKeys("18/12");
        driver.findElement(transactionDATE_RANGE).click();
        driver.findElement(amount).sendKeys("5000");
        driver.findElement(transactionAMOUNT).click();

        return new UpdateContact(driver);
    }

}
