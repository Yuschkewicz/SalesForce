package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDownForContacts;
import wrappers.InputsForContacts;
import wrappers.TextAreaForContacts;

import java.time.Duration;

public class NewContactsModal extends BasePage {
    public static final By SAVE = By.cssSelector("[title=Save");

    public NewContactsModal(WebDriver driver) {
        super();
        this.driver = driver;

    }

    @Override
    public boolean isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE));
        } catch (TimeoutException Ex) {
            return false;
        }
        return true;
    }

    public void createDropDownFields(String salutation, String lead_source) {
        new DropDownForContacts(driver, "Salutation").select(salutation);
               new DropDownForContacts(driver, "Lead Source").select(lead_source);
    }


    public void createInputFields(String phone, String mobile, String first_name, String last_name,
                                  String account_name, String email, String title, String reports_to, String mailing_city,
                                  String mailing_state, String other_city, String other_state, String mailing_zip,
                                  String mailing_country, String other_zip, String other_country,
                                  String fax, String department, String home_phone, String other_phone,
                                  String asst_phone, String assistant) {
        new InputsForContacts(driver, "Phone").write(phone);
        new InputsForContacts(driver, "Mobile").write(mobile);
        new InputsForContacts(driver, "First Name").write(first_name);
        new InputsForContacts(driver, "Last Name").write(last_name);
        new InputsForContacts(driver, "Account Name").write(account_name);
        new InputsForContacts(driver, "Email").write(email);
        new InputsForContacts(driver, "Title").write(title);
        new InputsForContacts(driver, "Reports To").write(reports_to);
        new InputsForContacts(driver, "Mailing City").write(mailing_city);
        new InputsForContacts(driver, "Mailing State/Province").write(mailing_state);
        new InputsForContacts(driver, "Other City").write(other_city);
        new InputsForContacts(driver, "Other State/Province").write(other_state);
        new InputsForContacts(driver, "Mailing Zip/Postal Code").write(mailing_zip);
        new InputsForContacts(driver, "Mailing Country").write(mailing_country);
        new InputsForContacts(driver, "Other Zip/Postal Code").write(other_zip);
        new InputsForContacts(driver, "Other Country").write(other_country);
        new InputsForContacts(driver, "Fax").write(fax);
        new InputsForContacts(driver, "Department").write(department);
        new InputsForContacts(driver, "Home Phone").write(home_phone);
        new InputsForContacts(driver, "Other Phone").write(other_phone);
        new InputsForContacts(driver, "Asst. Phone").write(asst_phone);
        new InputsForContacts(driver, "Assistant").write(assistant);


    }



    public void createTextAreFields(String mailing_street, String other_street, String description) {
        new TextAreaForContacts(driver, "Mailing Street").textAreaWrite(mailing_street);
        new TextAreaForContacts(driver, "Other Street").textAreaWrite(other_street);
        new TextAreaForContacts(driver, "Description").textAreaWrite(description);
    }

    public void saveContact() {
        driver.findElement(SAVE).submit();
    }

}




