package test;

import org.testng.annotations.Test;

public class ContactsTest extends BaseTest {
    @Test(description = "nonsequential, causing the test to fail")
    public void createNewContact() {
        loginPage.login();
        contactsPage.contactCreate();
        newContactsModal.createTextAreFields("Baiker str 222", "Lexington 234 ave.", "text");
        newContactsModal.createDropDownFields("Mr.","Advertisement");
        newContactsModal.createInputFields("+37529", "15479", "Gregory", "House",
                "TsM", "tsm@fmail.by", "there must be something", "Bideford",
                "Devon", "Barnstabple", "Devonshir", "131313", "UK", "11111", "Irish", "4569", "Police",
                "1111", "2222", "3333", "Angel");
        newContactsModal.saveContact();

    }


    @Test(description = " empirically established the need for sequential filling of fields")
    public void createContactWhenFillInSequentiallyFields(){
        loginPage.login();
        contactsPage.contactCreate();
        newContactsModal.createContactWhenFillInSequentiallyFields("+3725","78965","Dr.","Gregory","House","TsM",
                "tsm@fmail.by","qwerty","qwerty","qwerty","qwerty","qwerty","qwerty","qwerty","1111","qwerty","2222",
                "qwerty","14526","qwerty","654789","Advertisement","4587444","789487","44444","qwerty");
        newContactsModal.saveContact();
        newContactsModal.deleteContact();
    }

}
