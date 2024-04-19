package Steps;

import org.testng.annotations.Test;
import pages.HomePage;

public class TestSteps extends TestBase{

    @Test
    public void completeOrder() {

        new HomePage(driver).registration()
                .registrationSteps()
                .loginSteps()
                .openAccount()
                .BillPaymentSteps()
                .openAccount()
                .UpdateContactInfo()
                .requestLoanSteps();
    }
}
