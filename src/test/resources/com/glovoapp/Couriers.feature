Feature: Couriers registration functional tests
  Scenario: Register new Courier
    Given I am on the Registration page
    When I insert registration user data
    And  I click on Register button
    Then I see next page is opened

