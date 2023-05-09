Feature: Subscription
  @subscription
  Scenario: TC10 Subscription
  Given Scroll down to footer
  Then Verify text SUBSCRIPTION
  Then Enter email address in input and click arrow button
  Then Verify success message You have been successfully subscribed! is visible