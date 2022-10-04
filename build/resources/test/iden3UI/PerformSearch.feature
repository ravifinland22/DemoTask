Feature: Search for Stock Item
  As a logged in user,
  I want to search for a stock in the app
  So that I can start trading

  @sanity
  Scenario Outline: search stock successfully
    Given the app is launched
    And user is on the Landing screen
    When user logs in using "<userName>" and "<password>"
    Then user is on Home Screen
    When user taps on search icon
    And enters "<search_term>" on search bar
    And selects the item from the list
    Then user is on item details page

    Examples:
      | userName           | password | search_term |
      | testtest@testt.com | testing  | LUFTHANSA   |