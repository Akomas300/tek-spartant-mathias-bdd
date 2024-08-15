Feature:  Navigate to Retail and login with your credential,
  Navigate to Account profile and change your password.

  Scenario: validate user successfully sign in.
    When user click on sign in link
    Then validate user in sign in page
    When user enter sign in information
      | email    | akowa300@gmail.com |
      | password | Mathias1234!        |
    When user click on "Login" button
    When user click on "Account" link
    When user enter change the password
      | previousPassword | Mathias1234!  |
      | newPassword      | Mathias123! |
      | confirmPassword  | Mathias123! |
    When user click on "Change Password" button
    Then validate user information update successfully


    Scenario: Navigate to Retail app and in landing page search for a product.
      When user enter "TV" in the search box
      When user click on search
      Then validate searched products display on the page


      Scenario:  Navigate to Retail App and login with your credentials and
      Search for TV and Add TV to the cart
        When user click on sign in link
        Then validate user in sign in page
        When user enter sign in information
          | email    | akowa300@gmail.com |
          | password | Mathias1234!        |
        When user click on "Login" button
        When user enter "TV" in the search box
        When user click on search
        Then validate searched products display on the page
        When user click on the "TV" image
        When user click on Add to Cart button
        When user click on cart
        When user validate one item has been add to the cart
        When user delete the item from the cart
        Then user validate the the item has been deleted





