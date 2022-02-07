package com.sclondon.ui;

import java.util.Collections;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheContacts {

  public static Question<List<String>> displayed() {
    return actor -> Collections.singletonList(Text.of(ContactList.ENTRIES).answeredBy(actor));
  }
}
