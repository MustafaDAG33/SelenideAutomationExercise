Feature: Login User
  Scenario: TC02_LoginUser with Correct
  @LoginUserwithcorrectemailandpassword
  Scenario: TC02_CorrectLoginUser
    Given Click on Signup Login button
    Then Verify Login to your account is visible
    Then Enter correct email address and password
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible