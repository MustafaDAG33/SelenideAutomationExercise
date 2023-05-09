Feature: Contact us From
  @contactus
  Scenario: TC06 Contact us From
  Given Click on Contact Us button
  When Verify GET IN TOUCH is visible
  Then Enter name, email, subject and message
  Then Upload file
  Then Click Submit button
  Then Click OK button
  Then Verify success message Success! Your details have been submitted successfully. is visible
  Then Click Home button and verify that landed to home page successfully