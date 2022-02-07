package com.sclondon.tasks;

import com.sclondon.ui.NewContactForm;
import com.sclondon.ui.ContactList;
import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddANewContact implements Performable {

  private Map<String, String> contact;

  public AddANewContact() {
  }

  public AddANewContact(Map<String, String> contact) {
    this.contact = contact;
  }

  public static Performable withDetails(Map<String, String> contact) {
    return new AddANewContact(contact);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(ContactList.NEW_BUTTON),
        Enter.theValue(contact.get("Name")).into(NewContactForm.NAME),
        Enter.theValue(contact.get("Name")).into(NewContactForm.EMAIL),
        Enter.theValue(contact.get("Name")).into(NewContactForm.MOBILE),
        Enter.theValue(contact.get("Name")).into(NewContactForm.WORK),
        Click.on(NewContactForm.CREATE)
    );
  }
}
