package test;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test(description = "Negative test")
    public void invalidLoginOrPassword() {
        accountsPage.invalidLogin();
        accountsPage.invalidPassword();
    }


    @Test(description = "Positive  test with valid data")
    public void loginAndStart() {
        accountsPage.login();
    }


    @Test
    public void createAccount() {
        loginAndStart();
        accountsPage.accountCreate();
        newAccountModal.createInputFields("TsM", "tsm.by", "+37529", "789654", "Father Tsm", "11", "10000", "Bideford",
                "Devon", "Poole", "Dorset", "131313", "UK", "111111", "UK");
        newAccountModal.createDropDownFields("Reseller", "Biotechnology");
        newAccountModal.createTextAreaFields("any description", "Jakob 5 st", "McKnight 10");
        newAccountModal.save();


    }

}
