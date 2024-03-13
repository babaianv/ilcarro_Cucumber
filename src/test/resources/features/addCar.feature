Feature: Add car form

  @addCar
  Scenario: Verify that the user can fill out the add car form

    Given User launches Chrome Browser
    When User opens ilcarro Main Page
    And User clicks on Login Link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Ok button
    And User clicks Let the car work link
    And User fills Location field
    And User fills all form fields
    And User fills fuelOption
    And User uploads photo of the car
    And User clicks on Submit button
    Then User verifies Success message
    And User quites browser



