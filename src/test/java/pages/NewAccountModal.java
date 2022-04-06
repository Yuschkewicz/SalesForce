package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountModal extends BasePage {

public static final By SAVE = By.cssSelector("[title=Save");

    public NewAccountModal(WebDriver driver) {
        super(driver);

    }

    @Override
    public BasePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated((SAVE)));
        return this;
    }

    public NewAccountModal createAccountLite(Account account) {
    new Input(driver, "Account Name").write(account.getAccountName());
    new Input(driver, "Website").write(account.getWebsite());
    new DropDown(driver, "Type").select(account.getType());
    return this;
}
    public void createInputFields(String accountName, String webSite, String phone, String fax, String parent_account,
                                  String employees, String annual_revenue, String billing_city,
                                  String billing_state, String shipping_city, String shipping_state,
                                  String billing_zip, String billing_country, String shipping_zip,
                                  String shipping_country) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Website").write(webSite);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Parent Account").write(parent_account);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annual_revenue);
        new Input(driver, "Billing City").write(billing_city);
        new Input(driver, "Billing State/Province").write(billing_state);
        new Input(driver, "Shipping City").write(shipping_city);
        new Input(driver, "Shipping State/Province").write(shipping_state);
        new Input(driver, "Billing Zip/Postal Code").write(billing_zip);
        new Input(driver, "Billing Country").write(billing_country);
        new Input(driver, "Shipping Zip/Postal Code").write(shipping_zip);
        new Input(driver, "Shipping Country").write(shipping_country);
        driver.findElement(By.xpath("//span[text()='Copy Billing Address to Shipping Address']" +
                "/ancestor::div[contains(@class, 'uiInput')]//input")).click();


    }

    public void createDropDownFields(String type, String industry) {
        new DropDown(driver, "Type").select(type);
        new DropDown(driver, "Industry").select(industry);

    }

    public void createTextAreaFields(String description, String billing_street, String shipping_street) {
        new TextArea(driver, "Description").textAreaWrite(description);
        new TextArea(driver, "Billing Street").textAreaWrite(billing_street);
        new TextArea(driver, "Shipping Street").textAreaWrite(shipping_street);


    }

    public void save() {
        driver.findElement(SAVE).click();
    }
}
