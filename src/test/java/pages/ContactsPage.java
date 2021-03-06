package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsPage extends BasePage {

    public static final By BUTTON_NEW = By.cssSelector("a[title=New]");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(BUTTON_NEW);
    }

    public void clickNewForStartContactCreate() {
        driver.get(baseurl + "Contact/list?filterName=Recent");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class," +
//                "'slds-breadcrumb__item')]//span[text()='Contacts']")));
        driver.findElement(BUTTON_NEW).click();

    }
}
