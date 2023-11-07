Feature: Data Table Example

  Scenario: Data table with 1 column
    Given Go to the Web Page
    And Fill the form with valid data

    Then Save the form
    |John|
    |Snow|
    |6521 Spring ave.|
    |6321548965|
    Then Save the form

    Scenario: Data Table With Multiple Columns
      Given Go to the Web Page
      And Enter valid data
      |Name|John|
      |Last Name|Snow|
      |Address|6521 Spring Ave.|
      |Phone|6321548965|
      Then Save the form
