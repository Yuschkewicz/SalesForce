package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage {
    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title=New]")));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void contactCreate() {
        driver.get("https://tsw17.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class," +
                "'slds-breadcrumb__item')]//span[text()='Contacts']")));
        driver.findElement(By.cssSelector("a[title=New]")).click();

    }
}
