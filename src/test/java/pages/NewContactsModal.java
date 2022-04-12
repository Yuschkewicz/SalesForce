package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.DropDownForContacts;
import wrappers.InputsForContacts;
import wrappers.TextAreaForContacts;

public class NewContactsModal extends BasePage {
    public static final By SAVE = By.xpath("//button[@name='SaveEdit']");

    public NewContactsModal(WebDriver driver) {
        super(driver);


    }

    @Override
    public boolean isPageOpened() {
        return waitForElement(SAVE);
    }

    public void createDropDownFields(String salutation, String lead_source) {
        new DropDownForContacts(driver, "Salutation").select(salutation);
        new DropDownForContacts(driver, "Lead Source").select(lead_source);
    }


    public void createInputFields(String phone, String mobile, String firstName, String lastName,
                                  String accountName, String email, String title, String mailingCity,
                                  String mailingState, String other_city, String otherState, String mailingZip,
                                  String mailingCountry, String otherZip, String otherCountry,
                                  String fax, String department, String homePhone, String otherPhone,
                                  String asstPhone, String assistant) {
        new InputsForContacts(driver, "Phone").write(phone);
        new InputsForContacts(driver, "Mobile").write(mobile);
        new InputsForContacts(driver, "First Name").write(firstName);
        new InputsForContacts(driver, "Last Name").write(lastName);
        new InputsForContacts(driver, "Account Name").writeAndChoose(accountName);
        new InputsForContacts(driver, "Email").write(email);
        new InputsForContacts(driver, "Title").write(title);
        // new InputsForContacts(driver, "Reports To").write(reports_to);
        new InputsForContacts(driver, "Mailing City").write(mailingCity);
        new InputsForContacts(driver, "Mailing State/Province").write(mailingState);
        new InputsForContacts(driver, "Other City").write(other_city);
        new InputsForContacts(driver, "Other State/Province").write(otherState);
        new InputsForContacts(driver, "Mailing Zip/Postal Code").write(mailingZip);
        new InputsForContacts(driver, "Mailing Country").write(mailingCountry);
        new InputsForContacts(driver, "Other Zip/Postal Code").write(otherZip);
        new InputsForContacts(driver, "Other Country").write(otherCountry);
        new InputsForContacts(driver, "Fax").write(fax);
        new InputsForContacts(driver, "Department").write(department);
        new InputsForContacts(driver, "Home Phone").write(homePhone);
        new InputsForContacts(driver, "Other Phone").write(otherPhone);
        new InputsForContacts(driver, "Asst. Phone").write(asstPhone);
        new InputsForContacts(driver, "Assistant").write(assistant);


    }


    public void createTextAreFields(String mailing_street, String otherStreet, String description) {
        new TextAreaForContacts(driver, "Mailing Street").textAreaWrite(mailing_street);
        new TextAreaForContacts(driver, "Other Street").textAreaWrite(otherStreet);
        new TextAreaForContacts(driver, "Description").textAreaWrite(description);
    }

    public void saveContact() {
        driver.findElement(SAVE).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dr. Gregory House']")));
    }

    public void selectForDelete(String option) {
        driver.findElement(By.cssSelector(String.format("[title=Delete]", option))).click();
    }

    public void deleteContact() {
        driver.get(baseurl+"Contact/list?filterName=Recent");
        driver.findElement(By.xpath("//span[text()='Show Actions']//..")).click();
        selectForDelete("Delete");
        driver.findElement(By.xpath("//span[text()='Delete']")).click();

    }

    public void createContactWhenFillInSequentiallyFields(String phone, String mobile, String salutation,
                                                          String firstName, String lastName,
                                                          String accountName, String email, String title,
                                                          String mailingStreet, String otherStreet,
                                                          String mailingCity, String mailingState, String otherCity,
                                                          String otherState, String mailingZip,
                                                          String mailingCountry, String otherZip, String otherCountry,
                                                          String fax, String department, String homePhone,
                                                          String leadSource, String otherPhone,
                                                          String asstPhone, String assistant, String description) {

        new InputsForContacts(driver, "Phone").write(phone);
        new InputsForContacts(driver, "Mobile").write(mobile);
        new DropDownForContacts(driver, "Salutation").select(salutation);
        new InputsForContacts(driver, "First Name").write(firstName);
        new InputsForContacts(driver, "Last Name").write(lastName);
        new InputsForContacts(driver, "Account Name").writeAndChoose(accountName);
        new InputsForContacts(driver, "Email").write(email);
        new InputsForContacts(driver, "Title").write(title);
        new TextAreaForContacts(driver, "Mailing Street").textAreaWrite(mailingStreet);
        new TextAreaForContacts(driver, "Other Street").textAreaWrite(otherStreet);
        new InputsForContacts(driver, "Mailing City").write(mailingCity);
        new InputsForContacts(driver, "Mailing State/Province").write(mailingState);
        new InputsForContacts(driver, "Other City").write(otherCity);
        new InputsForContacts(driver, "Other State/Province").write(otherState);
        new InputsForContacts(driver, "Mailing Zip/Postal Code").write(mailingZip);
        new InputsForContacts(driver, "Mailing Country").write(mailingCountry);
        new InputsForContacts(driver, "Other Zip/Postal Code").write(otherZip);
        new InputsForContacts(driver, "Other Country").write(otherCountry);
        new InputsForContacts(driver, "Fax").write(fax);
        new InputsForContacts(driver, "Department").write(department);
        new InputsForContacts(driver, "Home Phone").write(homePhone);
        new DropDownForContacts(driver, "Lead Source").select(leadSource);
        new InputsForContacts(driver, "Other Phone").write(otherPhone);
        new InputsForContacts(driver, "Asst. Phone").write(asstPhone);
        new InputsForContacts(driver, "Assistant").write(assistant);
        new TextAreaForContacts(driver, "Description").textAreaWrite(description);

    }
}




