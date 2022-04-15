package steps;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AccountList;
import pages.NewAccountModal;

import static org.testng.Assert.assertTrue;

public class AccountSteps {
    AccountList accountList;
    NewAccountModal newAccountModal;

    public AccountSteps(WebDriver driver) {
        accountList = new AccountList(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    @Step("Создание аккаунта: '{account.accountName}'")
    public void create(Account account) {
        accountList.open();
        accountList.clickNew();
        assertTrue(newAccountModal.isPageOpened(), "Модалка сломалася");
        newAccountModal.createAccountLite(account);
        newAccountModal.save();
//assertTrue(accountList.isPageOpened(),"Лист аккаунта сломался");
    }
}
