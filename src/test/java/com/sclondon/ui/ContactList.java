package com.sclondon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactList {

  public static final Target NEW_BUTTON = Target.the("New button")
      .locatedBy("//button[.='New']");
  public static final By ENTRIES = By.cssSelector(".list-group-item");
}
