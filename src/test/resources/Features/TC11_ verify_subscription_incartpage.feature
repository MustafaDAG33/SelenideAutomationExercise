Feature:  Verify Subscription in Cart page
  @cart
  Scenario: TC11  Verify Subscription in Cart page
  Given Click Cart button
  Then Scroll down to footer
  Then Verify text SUBSCRIPTION
  Then Enter email address in input and click arrow button
  Then Verify success message You have been successfully subscribed! is visible