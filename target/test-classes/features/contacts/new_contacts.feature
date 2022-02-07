Feature: New Contacts

  As a sales person
  I want to keep track of my contacts' emails and phone numbers
  So I can get in touch with them more easily

  Scenario: add a new contact
    Given there are no contacts named "Sarah Jane" in the directory
    When Sally adds a new contact with the following details:
      | Name   | Sarah Jane         |
      | Email  | sarah-jane@who.com |
      | Mobile | 1234567890         |
      | Work   | 1234567890         |
    Then a new contact named "Sarah Jane" should be added to the directory

#  Scenario: View contacts
#    Given the following contacts exist:
#      | Name         | Email              | Mobile     | Work       |
#      | Sarah Jane   | sarah-jane@who.com | 1234567890 | 1234567899 |
#      | Clara Oswald | clara@who.com      | 1234567892 | 1234567894 |
#    When Sally views her contacts
#    Then she should see the following contacts:
#      | Sarah Jane   |
#      | Clara Oswald |