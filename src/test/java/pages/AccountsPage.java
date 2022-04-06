package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class AccountsPage extends BasePage {

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public static final By BUTTON_NEW=By.cssSelector("a[title=New]");

    @Override
    public boolean isPageOpened() {
       return waitForElement(BUTTON_NEW);
    }


    public void accountCreate() {
        driver.get("https://tsw17.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class," +
                "'slds-breadcrumb__item')]//span[text()='Accounts']")));
        driver.findElement(BUTTON_NEW).click();


    }

}
