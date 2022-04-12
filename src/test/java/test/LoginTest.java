package test;

import dto.Account;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test(description = "Negative test")
    public void invalidLogin() {
        loginPage.invalidLogin();
        String notification = driver.findElement(By.id("error")).getText();
        assertEquals(notification, "Please check your username and password." +
                " If you still can't log in, contact your Salesforce administrator.");
    }
    @Test
    public  void invalidPassword(){
        loginPage.invalidPassword();
        String alert = driver.findElement(By.id("error")).getText();
        assertEquals(alert, "Please check your username and password. " +
                "If you still can't log in, contact your Salesforce administrator.");
    }


    @Test(description = "Positive  test with valid data and using DTO")
    public void loginAndStart() {
        loginPage.login();
        Account account = new Account("Tsm", "tsm.by", "Analyst", "456987", "789654", "Dad TsM", "wtf", "Sika", "description", "Kalinovskogo 18-63");
        accountSteps.create(account);
    }

}
