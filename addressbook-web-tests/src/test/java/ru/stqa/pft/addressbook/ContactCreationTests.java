package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        gotoAddContactPage();
        fillContactForm(new ContactData("Alena", "Belousova", "Sochi", "albelspb@gmail.com"));
        submitContactCreation();
        returnToHomePage();
    }
}
