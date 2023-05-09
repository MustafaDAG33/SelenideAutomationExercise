Feature: Register User with Existing Email
  @registeruser_with_existingemail
  Scenario: TC05_Register User with Existing Email
  Given Click on Signup Login button
  When Verify New User Signup is visible
  Then Enter name and already registered email address
  Then Click Signup button
  Then Verify error Email Address already exist is visible