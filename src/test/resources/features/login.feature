Feature: Login

  @validData
  Scenario: Check User can login with valid data
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login Link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success message displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Check User cant login with invalid password
    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login Link
    And User enters valid email and invalid password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message displayed
    And User quites browser
    Examples:
      | email               | password      |
      | annasmith123@gm.com | Annasmith1234 |
      | annasmith123@gm.com | annasmith123! |
      | annasmith123@gm.com | ANNASMITH123! |
      | annasmith123@gm.com | Annasmith!    |
      | annasmith123@gm.com | 12345678900!  |
      | annasmith123@gm.com | !!!!!!!!!!!!! |