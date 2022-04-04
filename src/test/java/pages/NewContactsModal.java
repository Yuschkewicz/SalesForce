package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

public class NewContactsModal extends BasePage {

    public NewContactsModal(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void createInputFields(String phone, String mobile, String first_name, String last_name,
                                  String account_name, String email, String title, String reports_to, String mailing_city,
                                  String mailing_state, String other_city, String other_state, String mailing_zip,
                                  String mailing_country, String other_zip, String other_country,
                                  String fax, String department, String home_phone, String other_phone,
                                  String asst_phone, String assistant) {
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Mobile").write(mobile);
        new Input(driver, "First Name").write(first_name);
        new Input(driver, "Last Name").write(last_name);
        new Input(driver, "Account Name").write(account_name);
        new Input(driver, "Email").write(email);
        new Input(driver, "Title").write(title);
        new Input(driver, "Reports To").write(reports_to);
        new Input(driver, "Mailing City").write(mailing_city);
        new Input(driver, "Mailing State/Province").write(mailing_state);
        new Input(driver, "Other City").write(other_city);
        new Input(driver, "Other State/Province").write(other_state);
        new Input(driver, "Mailing Zip/Postal Code").write(mailing_zip);
        new Input(driver, "Mailing Country").write(mailing_country);
        new Input(driver, "Other Zip/Postal Code").write(other_zip);
        new Input(driver, "Other Country").write(other_country);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Department").write(department);
        new Input(driver, "Home Phone").write(home_phone);
        new Input(driver, "Other Phone").write(other_phone);
        new Input(driver, "Asst. Phone").write(asst_phone);
        new Input(driver, "Assistant").write(assistant);


    }

    public void createDropDownFields(String salutation, String lead_source) {
        new DropDown(driver, "Salutation").select(salutation);
        new DropDown(driver, "Lead Source").select(lead_source);
    }

    public void createTextAreFields(String mailing_street, String other_street, String description) {
        new TextArea(driver, "Mailing Street").textAreaWrite(mailing_street);
        new TextArea(driver, "Other Street").textAreaWrite(other_street);
        new TextArea(driver, "Description").textAreaWrite(description);
    }

    public void save() {
        driver.findElement(By.cssSelector("[title=Save]")).click();
    }

}




