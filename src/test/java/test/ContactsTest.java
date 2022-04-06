package test;

import org.testng.annotations.Test;

public class ContactsTest extends BaseTest {
    @Test
    public void createNewContact() {
        loginPage.login();
        contactsPage.contactCreate();
        newContactsModal.createInputFields("+37529", "15479", "Gregory", "House",
                "TsM", "tsm@fmail.by", "there must be something", "wtf", "Bideford",
                "Devon", "Barnstabple", "Devonshir", "131313", "UK", "11111", "Irish", "4569", "Police",
                "1111", "2222", "3333", "Angel");
        newContactsModal.createDropDownFields("Dr", "Social");
        newContactsModal.createTextAreFields("Baiker str 222", "Lexington 234 ave.", "text");
        newContactsModal.saveContact();

    }
}
