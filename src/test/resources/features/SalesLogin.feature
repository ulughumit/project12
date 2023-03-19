Feature: Sales and Expenses managers login function
  Agile Story: As sales and expense manager, I want to Login with valid credentials and get my account name.


  Scenario Outline: Verify managers login with valid credentials and get their account names.
    When Users login with their "<email>" and "<password>"
    Then Users see the correct "<account holder name>"
    Examples:
      | email                      | password        | account holder name |
      | salesmanager15@info.com    | salesmanager    | SalesManager15      |
      | expensesmanager11@info.com | expensesmanager | ExpensesManager11   |




