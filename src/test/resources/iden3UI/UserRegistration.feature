Feature: User registration
  As a new user,
  I want to register myself into the app
  So that I can start using the app

  @smoke
  Scenario Outline: Complete user registration successfully
    Given the app is launched
    And user is on the Landing screen
    When user clicks on create new account button
    Then user is on Sign Up screen
    When user sets "<firstName>","<lastName>","<emailAddress>","<password>","<phoneNumber>","<country>" on Sign Up screen
    And user checks terms and conditions and clicks on clicks on Open Account button
    Then user account is registered and user is on home page

    Examples:
      | password  | firstName | emailAddress         | phoneNumber | lastName | country     |
      | Test@1234 | test      | softpaytest@test.com | 9911991122  | user     | Afghanistan |

