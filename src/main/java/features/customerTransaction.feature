# new feature
# Tags: optional

Feature: Customer Transaction

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I login successfully with username as Harry Potter
    When I verify user input Deposit successful with 2000
    When I verify user input Withdraw successful with 1000

  Scenario Outline: Customer Transaction Successfully
    When I click transaction tab
    Then I verify user input <deposit> and <withdraw> Successfully
    When I click reset button
    Then I verify the data of transaction is clear
    When I click back button
    Then I verify user navigate to login page

    Examples:
      | deposit | withdraw |
      | 2000    | 1000     |



