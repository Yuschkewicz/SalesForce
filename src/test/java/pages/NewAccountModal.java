package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;
@Log4j2
public class NewAccountModal extends BasePage {

    public static final By SAVE = By.cssSelector("[title=Save");

    public NewAccountModal(WebDriver driver) {
        super(driver);

    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(SAVE);
    }

    public NewAccountModal createAccountLite(Account account) {
        log.info("Creation of account {}",account.getAccountName());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown(driver, "Type").select(account.getType());
        return this;
    }

    public void createInputFields(String accountName, String webSite, String phone, String fax, String parentAccount,
                                  String employees, String annualRevenue, String billingCity,
                                  String billingState, String shippingCity, String shippingState,
                                  String billingZip, String billingCountry, String shippingZip,
                                  String shippingCountry) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Website").write(webSite);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Parent Account").write(parentAccount);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Billing Zip/Postal Code").write(billingZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
        driver.findElement(By.xpath("//span[text()='Copy Billing Address to Shipping Address']" +
                "/ancestor::div[contains(@class, 'uiInput')]//input")).click();


    }

    public void createDropDownFields(String type, String industry) {
        new DropDown(driver, "Type").select(type);
        new DropDown(driver, "Industry").select(industry);

    }

    public void createTextAreaFields(String description, String billingStreet, String shippingStreet) {
        new TextArea(driver, "Description").textAreaWrite(description);
        new TextArea(driver, "Billing Street").textAreaWrite(billingStreet);
        new TextArea(driver, "Shipping Street").textAreaWrite(shippingStreet);


    }

    public void save() {
        driver.findElement(SAVE).click();
    }
}
