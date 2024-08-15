Feature: Navigate to the sign in page and sign in whit a valid user name and password.

  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter "nasibamehraban1@gmail.com" and "Nasiba@123" and click on login
    Then user should be able to see account link

@scenario2
  Scenario Outline:
    When user click on sign in link
    Then validate user in sign in page
    When user enter "<WrongUsername>" and "<WrongPassword>" and click on login
    Then user should see error "wrong username or password"
    Examples:
      | WrongUsername            | WrongPassword  |
      | WrongUsername@gmail.com  | MAthais2121!   |
      | WrongUsername1@gmail.com | MATHIASas2212@ |
@scenario3
  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter sign in information
    |email|nasibamehraban1@gmail.com|
    |password|Nasiba@123            |
    When user click on "Login" button
    Then user should be able to see account link