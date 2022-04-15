package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class ContactList extends BasePage {
    public static final By TITLE = By.xpath("//div[contains(@class, 'slds-breadcrumb__item')]//span[text()='Contacts']");

    public ContactList(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        log.info("waiting to Contact list to be opened");
        return waitForElement(TITLE);
    }

    @Step(" open page for contact create")
    public ContactList open() {
        log.info(" open page for contact create");
        driver.get("https://tsw17.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        isPageOpened();
        return this;
    }

    @Step(" click button NEW and start process creating contact")

    public NewContactsModal clickNew() {
        log.info("click button NEW and start process creating contact");
        driver.findElement(By.cssSelector("a[title=New")).click();
        return new NewContactsModal(driver);
    }
}
