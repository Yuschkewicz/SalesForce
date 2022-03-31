package test;

import org.testng.annotations.Test;

public class ContactsTest extends BaseTest{
    @Test
    public void createNewContact(){

        contactsPage.newContacts();
    }
}
