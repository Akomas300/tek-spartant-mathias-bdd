Feature: Navigate to the sign in page and sign in whit a valid user name and password.

  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter "nasibamehraban1@gmail.com" and "Nasiba@123" and click on login
    Then user should be able to see account link
#Feature: Navigate to sign in page and sign in with Invalid username and valid password.

  Scenario: Validate error message displays "wrong username or password"
    When user click on sign in link
    Then validate user in sign in page
    When user enter "WrongUsername@gmail.com" and "WrongPassword" and click on login
    Then user should see error "wrong username or password"