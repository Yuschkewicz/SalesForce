package test;

import dto.Account;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Negative test")
    public void invalidLoginOrPassword() {
        loginPage.invalidLogin();
        loginPage.invalidPassword();
    }


    @Test(description = "Positive  test with valid data")
    public void loginAndStart() {
        loginPage.login();
        Account account=new Account("Tsm", "tsm.by", "Biotechnology");
        accountSteps.create(account);
    }

}
