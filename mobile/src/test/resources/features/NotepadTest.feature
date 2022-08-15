@Appium
Feature: As a user, I want to test the note application

  Scenario Outline: I want to write a name
    Given The user opened the Notepad Application
    And The user clicked on new note
    Then The user write the title <title>
    And The user write the content <content>
    And The user click on save note
    Then The user validate the title with the text <title> displayed


    Examples:
      | title | content|
      | "My Name"   |  "Jesus Salatiel"   |
      | "My Crush"   |  "Ana Rodriguez"   |


