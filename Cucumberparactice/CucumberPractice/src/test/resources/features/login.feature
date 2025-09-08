Feature: Login functionality

  Scenario Outline: Successful Login
    Given open the browser and launch the login page
    When login with username "<username>" and password "<password>"
    Then should see the home page

    Examples:
      | username | password |
      | Tester | test    |
      | Varun  | re123   |
      

  Scenario Outline: Failed login
    Given open the browser and launch the login page
    When login with username "<username>" and password "<password>"
    Then should see an error message

    Examples:
      | username | password |
      | Varun    | hi19     |
      