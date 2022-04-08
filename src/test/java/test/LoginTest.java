package test;

import dto.Account;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Negative test")
    public void invalidLoginOrPassword() {
        loginPage.invalidLogin();
        loginPage.invalidPassword();
    }


    @Test(description = "Positive  test with valid data and using DTO")
    public void loginAndStart() {
        loginPage.login();
        Account account = new Account("Tsm", "tsm.by", "Analyst", "456987", "789654", "Dad TsM", "wtf", "Sika", "description", "Kalinovskogo 18-63");
        accountSteps.create(account);
    }

}
