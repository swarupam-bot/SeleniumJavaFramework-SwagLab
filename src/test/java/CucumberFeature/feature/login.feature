Feature: Login Functionality
  Try to do login on the appliaction

  Scenario: Try to login with wrong credentials
    Given launch the application and navigate to login page.
    When Give the wrong credentials for login.
    Then Verify the error message.