#language:en
Feature: Purchase is made

  Scenario: The user buys a backpack
    Given the user enters the website
      | user          | pass         |
      | standard_user | secret_sauce |
    When the user buys two items
      | name | lastName | zip    |
      | Juan | Guzman   | 050035 |
    Then the user should see the purchase successfully completed

