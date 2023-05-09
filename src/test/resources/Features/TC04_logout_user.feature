Feature: Logout User
  @logout_user
  Scenario: TC04 Logout User
  Given Click on Signup Login button
  When Verify Login to your account is visible
  Then Enter correct email address and password
  Then Click login button
  Then Verify that Logged in as username is visible
  Then Click Logout button
  Then Verify that user is navigated to login page