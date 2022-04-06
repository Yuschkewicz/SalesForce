package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountList extends BasePage {
    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']");


    public AccountList(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(TITLE);
    }

    @Step(" степ какойто")
    public AccountList open() {
        driver.get("https://tsw17.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step(" еще какойото")
    public NewAccountModal clickNew() {
        driver.findElement(By.cssSelector("a[title=New")).click();
        return new NewAccountModal(driver);
    }
}
