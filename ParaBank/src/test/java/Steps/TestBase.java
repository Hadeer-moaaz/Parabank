package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    WebDriver driver;
    @BeforeSuite
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
    }

//    @AfterSuite
//    public void closeBrowser (){
//
//        driver.quit();
//    }

}