package test;

import dto.Account;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {


    @Test
    public void createAccount() {
        loginPage.login();
        accountsPage.accountCreate();
        newAccountModal.createInputFields("TsM", "tsm.by", "+37529", "789654", "Father Tsm", "11", "10000", "Bideford",
                "Devon", "Poole", "Dorset", "131313", "UK", "111111", "UK");
        newAccountModal.createDropDownFields("Reseller", "Biotechnology");
        newAccountModal.createTextAreaFields("any description", "Jakob 5 st", "McKnight 10");
        newAccountModal.save();


    }

    @Test
    public void createAccountWithBuilder(){
        loginPage.login();
        accountsPage.accountCreate();
        Account account=Account.builder()
                .accountName("Gregory")
                .phone("+65489665")
                .build();
    }

}
