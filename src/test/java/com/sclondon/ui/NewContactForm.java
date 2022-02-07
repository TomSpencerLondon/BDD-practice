package com.sclondon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewContactForm {
  public static final Target NAME = Target.the("Name field").located(By.name("contact-name"));
  public static final Target EMAIL = Target.the("Email field").located(By.name("contact-email"));
  public static final Target MOBILE = Target.the("Mobile field").located(By.name("contact-phone-mobile"));
  public static final Target WORK = Target.the("Work field").located(By.name("contact-phone-work"));
  public static final Target CREATE = Target.the("Create button").located(By.xpath("//button[.='Create']"));
}
