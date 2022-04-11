package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
@Log4j2
public class AccountList extends BasePage {
    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Accounts']");


    public AccountList(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        log.info("waiting for Account List to be opened");
        return waitForElement(TITLE);
    }

    @Step(" степ какойто")
    public AccountList open() {
        log.info("");
        driver.get("https://tsw17.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step(" еще какойото")

    public NewAccountModal clickNew() {
        log.info("");
        driver.findElement(By.cssSelector("a[title=New")).click();
        return new NewAccountModal(driver);
    }
}
