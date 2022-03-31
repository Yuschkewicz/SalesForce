package test;

import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {
    @Test
    public void loginAndStart(){
        accountsPage.login();
    }
    @Test
    public void createAccount(){
        accountsPage.accountCreate();


    }

}
