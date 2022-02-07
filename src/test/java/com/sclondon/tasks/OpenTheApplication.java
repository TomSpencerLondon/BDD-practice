package com.sclondon.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheApplication {
  public static Performable onTheHomePage() {
    return Task.where("{0} opens the application",
        Open.url("https://screaenplay-contacts.herokuapp.com"));
  }
}
