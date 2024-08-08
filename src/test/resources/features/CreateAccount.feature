Feature: Navigate to create account page and create new account
  Background: Setup create account scenarios
    When user click on "Sign in" link
    Then validate user in sign in page
    When user click on "Create New Account" link

  Scenario: Validate new account is created
    Then validate user in sign up page
    When user inter "Mathias","akowa300@gmail.com","Mathias123!" and "Mathias123!"
    When user click on "Sign Up" button
    Then confirm user successfully sign up
@scenario1
    Scenario: Navigate to Create Account page and Create new Account
    With existing email and validate error message
      Then validate user in sign up page
      When user inter "Mathias","akowa300@gmail.com","Mathias123!" and "Mathias123!"
      When user click on "Sign Up" button
      Then user should see error "this email is already exist, please use another email address"





































































