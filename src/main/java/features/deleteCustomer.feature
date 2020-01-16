Feature: Delete Customer

  Background:
    Given Open website https://www.way2automation.com/angularjs-protractor/banking/#/manager/list

  Scenario Outline: Delete Customer
    Then I verify that system is already delete customer <firstName> as <lastName> as <postCode>

    Examples:
      | firstName | lastName | postCode |
      | Harry     | Potter    | E725JB   |


