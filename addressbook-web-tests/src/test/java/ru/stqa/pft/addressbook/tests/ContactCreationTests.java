package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.gotoAddContactPage();
        app.fillContactForm(new ContactData("Alena", "Belousova", "Sochi", "albelspb@gmail.com"));
        app.submitContactCreation();
        app.returnToHomePage();
    }
}
