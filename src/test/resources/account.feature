Feature: Bank Account

  Scenario: Make a deposit to a new account
    Given I have an account with 0 dollars
    When I deposit 100 dollars
    Then my new balance should be 100 dollars

  Scenario: Make a deposit to an account
    Given I have an account with 100 dollars
    When I deposit 100 dollars
    Then my new balance should be 200 dollars

  Scenario: Make a deposit to an account
    Given I have an account with 100 dollars
    When I deposit 100 dollars
    Then my new balance should be 150 dollars