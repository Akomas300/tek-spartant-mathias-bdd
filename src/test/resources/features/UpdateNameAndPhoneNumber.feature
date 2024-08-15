Feature: navigate to retail app and login with your credential
  Navigate to account page and update Name and phone number.

  @smoke1
  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter sign in information
      | email    | nasibamehraban1@gmail.com |
      | password | Nasiba@123                |
    When user click on "Login" button
    When user click on "Account" link
    When user update information
      | name        | Mathias    |
      | phoneNumber | 8046619882 |
    When user click on "Update" button
    Then validate user information update successfully

  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter sign in information
      | email    | nasibamehraban1@gmail.com |
      | password | Nasiba@123                |
    When user click on "Login" button
    When user click on "Account" link
    When user update information
      | oldPassword     | Mathias123!  |
      | newPassword     | Mathias1234! |
      | confirmPassword | Mathias1234! |
    When user click on "Change Password" button
    Then validate user information update successfully
