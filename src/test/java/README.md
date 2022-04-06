Значит так: вскрытие установило, что труп умер от вскрития.

public class ContactsTest
Когда  newContactsModal.createDropDownFields запускается в совокупности методов, то тест падает,
если же сделать отдельный 
##
@Test
public void dropDownFieldsCheck(){
loginPage.login();
contactsPage.contactCreate();
newContactsModal.createDropDownFields("Mr.","Advertisement");

Не знаю...но вроде баг. Ведь порядок заполнения полей не указан....


